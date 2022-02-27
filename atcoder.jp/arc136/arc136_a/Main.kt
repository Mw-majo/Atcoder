import kotlin.math.abs

fun main() {
    val n = readInt()
    val sList = readLn().toCharArray()
    var bFlag = false
    val ans = sList.map {
        when (it) {
            'A' -> { "A" }
            'B' -> {
                if (bFlag) {
                    bFlag = false
                    "A"
                } else {
                    bFlag = true
                    ""
                }
            }
            'C' -> {
                if (bFlag) {
                    bFlag = false
                    "BC" 
                } else {
                    "C"
                }
            }
            else -> { it }
        }
    }.toMutableList()
    ans.add(if (bFlag) "B" else "")
    
    println(ans.joinToString(separator = ""))
 }

// ba -> ab
// bb -> a
// bba, bab, abb -> aa
// aaa -> aaa
// aab, aba, baa -> aab
// bbb -> ab

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
