fun main() {
    val (a, b, c) = readInts()
    
    val sum = a + b + c
    val ans = 111 * sum
    println(ans)
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split("").filter { it != "" }
private fun readInts() = readStrings().map { it.toInt() }