fun main() {
    var x = readDouble()
    
    println(Math.round(x).toInt())
    


}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readDouble() = readLn().toDouble()

private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
