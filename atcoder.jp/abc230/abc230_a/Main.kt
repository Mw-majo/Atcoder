fun main() {
    val n = readInt()
    
    
    val ans = "AGC0" + if (n >= 42) {
        n + 1
    } else {
        if (n < 10) "0" + n
        else n
    }
    
    println(ans)
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
