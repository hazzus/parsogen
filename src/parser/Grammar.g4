grammar Grammar;

@header {
package parser;
import grammar.*;
import java.util.LinkedList;
}

full returns [Grammar grammar]
    : h=CODE t=toks i=ignore r=rules s=start
    {
        $grammar = new Grammar($h.text, $t.val, $i.val, $r.val, $s.val);
    };

toks returns [List<TokenRule> val]
    : TOKENS '[' t=tokensList ']'
    {
        $val = $t.val;
    };

tokensList returns [List<TokenRule> val]
    : head=singleToken tail=tokensList
    {
        $val = $tail.val;
        $val.add(0, $head.val);
    }
    | { $val = new LinkedList<TokenRule>(); }
    ;

singleToken returns [TokenRule val]
    : id=NAME '=' regex=REGEX ';'
    {
        $val = new TokenRule($id.text, $regex.text);
    };

ignore returns [List<String> val]
    : IGNORE '[' ignores=ignoreList ']'
    {
        $val = $ignores.val;
    };

ignoreList returns [List<String> val]
    : head=NAME ';' tail=ignoreList
    {
        $val = $tail.val;
        $val.add(0, $head.text);
    }
    | head=NAME
    {
        $val = new LinkedList<String>();
        $val.add(0, $head.text);
    }
    | { $val = new LinkedList<String>(); }
    ;

rules returns [List<ParserRule> val]
    : RULES '[' r=ruleList ']'
    {
        $val = $r.val;
    };

ruleList returns [List<ParserRule> val]
    : head=singleRule tail=ruleList
    {
        $val = $tail.val;
        $val.add(0, $head.val);
    }
    | { $val = new LinkedList<ParserRule>(); }
    ;

singleRule returns [ParserRule val]
    : name=NAME '(' args=arguments ')' ':' type=NAME '=' alts=alternatives ';'
    {
        $val = new ParserRule($name.text, $args.val, $type.text, $alts.val);
    };

//singleRule returns [ParserRule val]
//    : name=NAME '(' args=arguments ')' ':' '[' types=arguments ']' '=' alts=alternatives ';'
//    {
//        $val = new ParserRule($name.text, $args.val, $types.val, $alts.val);
//    };

arguments returns [List<RuleArgument> val]
    : head=argument ',' tail=arguments
    {
        $val = $tail.val;
        $val.add(0, $head.val);
    }
    | x=argument {
        $val = new LinkedList<RuleArgument>();
        $val.add(0, $x.val);
    }
    | { $val = new LinkedList<RuleArgument>(); }
    ;

argument returns [RuleArgument val]
    : name=NAME ':' type=NAME
    {
        $val = new RuleArgument($name.text, $type.text);
    };

alternatives returns [List<RuleAlternative> val]
    : head=ruleBody '|' tail=alternatives
    {
        $val = $tail.val;
        $val.add(0, $head.val);
    }
    | head=ruleBody
    {
        $val = new LinkedList<RuleAlternative>();
        $val.add(0, $head.val);
    }
    | { $val = new LinkedList<RuleAlternative>(); }
    ;

ruleBody returns [RuleAlternative val]
    : (init=CODE)? EPS (code=CODE)?
    {
        $val = new EpsilonAlternative($init.text, $code.text);
    }
    | init=CODE? bodies=atoms (code=CODE)?
    {
        $val = new AtomAlternative($init.text, $atoms.val, $code.text);
    }
    ;

atoms returns [List<RuleAtom> val]
    : head=atom tail=atoms
    {
        $val = $tail.val;
        $val.add(0, $head.val);
    }
    | { $val = new LinkedList<RuleAtom>(); };

atom returns [RuleAtom val]
    : term=terminal { $val = $term.val; }
    | nonTerm=nonTerminal { $val = $nonTerm.val; };

terminal returns [RuleAtom val]
    : id=NAME
    {
        $val = new Terminal($id.text);
    };

nonTerminal returns [RuleAtom val]
    : id=NAME '(' params=parameters ')'
    {
        $val = new NonTerminal($id.text, $params.val);
    };

parameters returns [List<String> val]
    : head=CODE ',' tail=parameters
    {
        $val = $tail.val;
        $val.add(0, $head.text);
    }
    | x=CODE
    {
        $val = new LinkedList<String>();
        $val.add(0, $x.text);
    }
    | { $val = new LinkedList<String>(); };

start returns [String val]
    : START '=' name=NAME ';'
    {
        $val = $name.text;
    };

WHITESPACE:     [ \t\n\r]+ -> skip;
// COMMANDS
EPS:            '$';
TOKENS:         '@tokens';
IGNORE:         '@skip';
START:          '@start';
RULES:          '@rules';
// CODE, taking "as is"
CODE:           '{' (~[{}]+ CODE?)* '}';
NAME:           [a-zA-Z][a-zA-Z0-9_<>,]*;
REGEX:          '"'(~["])+'"';