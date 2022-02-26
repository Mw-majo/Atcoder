import kotlin.math.abs

fun main() {
    val (n, m) = readInts()
    val aLine = readInts()
    val bLine = readInts()
    val aMap = aLine.map {
        it to aLine.count { aa -> aa == it }
    }.toMap().toMutableMap()
    /*val eatableLine = (1..1000).map { pastaLength ->
        aLine.count { it == pastaLength }
    }.toMutableList()
    */
    
    var isEat = false
    //println(aMap[1])
    
    for (i in 0..m - 1) {
        val temp: Int = aMap[bLine[i]]?.toInt() ?: 0
        if (temp == 0) break
        aMap[bLine[i]] = temp - 1
        if (i == m - 1) isEat = true
    }
    
    println( 
        if (isEat) "Yes" else "No" 
    )
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
