fun main() {
    val (n, x) = readInts()
    val list = readInts()
    val ansList = mutableListOf<Int>()
    
    var temp = x - 1
    
    repeat (n){
        ansList.add( temp )
        temp = list[temp] - 1
    }
    
    
    println ( ansList.distinct().size )
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
