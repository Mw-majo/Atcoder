fun main() {
    val s = readStrings()
    
    println(s[0].toInt()*s[2].toInt())
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split("").filter{it!=""}
private fun readInts() = readStrings().map { it.toInt() }
private fun readLongs() = readStrings().map { it.toLong() }

