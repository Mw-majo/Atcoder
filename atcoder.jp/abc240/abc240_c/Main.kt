import kotlin.math.abs

fun main() {
    val (n, x) = readInts()
    val jumpList = mutableListOf<List<Int>>()
    repeat(n) { jumpList.add(readInts()) }
    
    var positionList = listOf<Int>(0)
    for (i in 0..n - 1) {
        val tempList = mutableListOf<Int>()
        for (p in positionList) {
            tempList.add(p + jumpList[i][0])
            tempList.add(p + jumpList[i][1])
        }
        positionList = tempList.distinct()
    }
    
    val answer = if (positionList.contains(x)) "Yes" else "No"
    println(answer)
 }

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
private fun readLineFaster(n: Int): List<String> {
    val reader = System.`in`.bufferedReader()
    val list = mutableListOf<String>()
    
    for (i in 1..n) list.add(reader.readLine()!!)
    
    val answer: List<String> = list
    return answer
}
