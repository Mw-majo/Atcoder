fun main() {
    val (h, w) = readInts()
    val list = mutableListOf<List<Int>>()
    val xSumList = mutableListOf<Int>()
    
    val xArithmeticSequence = 0..w - 1
    val yArithmeticSequence = 0..h - 1
    
    repeat(h) {
        val column = readInts()
        list.add(column)
        xSumList.add(column.sum())
    }
    
    val ySumList = xArithmeticSequence.map { x ->
        yArithmeticSequence
            .map { y -> list[y][x] }
            .sum()
    }
    
    
    println(
        yArithmeticSequence.joinToString(separator = "\n") { y ->
            xArithmeticSequence.joinToString(separator = " ") { x ->
                (xSumList[y] + ySumList[x] - list[y][x]).toString()
                //xSumList[y].toString()
            }
        }
    
    )
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
