fun main() {
    var n = readInt()
    val list = mutableListOf<List<Int>>()
    repeat(n){
        list.add(readInts())
    }
    
    
    println(list.distinct().size)
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readDouble() = readLn().toDouble()

private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
