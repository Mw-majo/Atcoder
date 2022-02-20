import kotlin.math.abs

fun main() {
    val (a, b) = readInts()
    
    println(
        if (abs(a - b) == 1 || abs(a - b) == 9) "Yes" else "No"
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
