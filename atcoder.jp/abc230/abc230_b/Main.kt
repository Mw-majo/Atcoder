fun main() {
    val s = readLn()
    
    val t = "oxxoxxoxxoxxoxxoxxoxxoxxoxxo"
    val flg = t.contains(s)
    
    println(if (flg) "Yes" else "No")
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split("")
private fun readInts() = readStrings().map { it.toInt() }
