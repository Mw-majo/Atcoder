fun main() {
    val n= readInt()
    
    println(
        if (n != null) "Yes"
        else "No"
    )
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toIntOrNull()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
