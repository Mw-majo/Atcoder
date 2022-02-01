import kotlin.math.abs

fun main() {
    val (n, k) = readInts()
    val aList = readInts()
    val bList = readInts()
    
    val numberSequence = 0..n - 1
    val sumAbsoluteNumber = numberSequence
        .map { abs(aList[it] - bList[it]) }
        .sum()
    
    //println(sumAbsoluteNumber)
    println(if (sumAbsoluteNumber <= k && (k - sumAbsoluteNumber) % 2 == 0) "Yes" else "No")
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
