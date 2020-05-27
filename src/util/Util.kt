package util

import grammar.*
import java.nio.file.Path
import java.nio.file.Paths

fun resolvePath(path: Path?, name: String, suffix: String): Path {
    return if (path == null) {
        Paths.get(".", "${name}${suffix}.kt")
    } else {
        path.resolve("${name}${suffix}.kt")
    }
}

fun buildArguments(args: List<RuleArgument>): String {
    return args.joinToString(", ") { "${it.name}: ${it.type}" }
}

fun buildArgumentsNoType(args: List<RuleArgument>): String {
    return args.joinToString(", ") { if (it.name.startsWith("$")) "parsogenVal${it.name}" else it.name }
}

fun formatCode(code: String?): String {
    return code?.substring(1, code.length - 1)?.replace(Regex("${"\\$"}([0-9])+"), "parsogenVal$1") ?: ""
}

fun buildParameters(params: List<String>): String {
    return params.joinToString(", ") { formatCode(it) }
}