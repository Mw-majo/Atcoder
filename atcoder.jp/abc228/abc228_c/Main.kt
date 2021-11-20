fun main() {
    val (n, k) = readInts()
    val list = mutableListOf<List<Int>>()
    
    for (i in 0..n - 1) {
        val _list = mutableListOf<Int>()
        _list.add(i + 1)
        _list.add(readInts().sum())
        list.add(_list)
    }
    
    val rankList = list.sortedBy { it[1]  * -1 }
    val referenceScore = rankList[k - 1][1]
    
    for (i in 0..n - 1) {
        println(
            if ((list[i][1] + 300) >= referenceScore ) "Yes"
            else "No"
        )
    }
    //println(list)
    /*for ( i = 0..n-1 ) {
        println ( "Yes" )
    }*/
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
