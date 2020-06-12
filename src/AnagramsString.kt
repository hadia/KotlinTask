fun main() {
    println("${"debit card".anagramsString("bad credit")}")
    println("${"punishments".anagramsString(" thumps nine9")}")
}

fun String.anagramsString(stringValue: String): Boolean {
    val firstListOfChars = this.replace("\\s".toRegex(), "").toList()
    val secondListOfChars = stringValue.replace("\\s".toRegex(), "").toList()
    return firstListOfChars.containsAll(secondListOfChars) && secondListOfChars.containsAll(firstListOfChars)
}




