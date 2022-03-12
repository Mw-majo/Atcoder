fun main() {
    val (v, a, b, c) = readInts()
    var ans = ""
    var tempV = v
    val sumABC = a + b + c
    var flg = true
    while (flg) {
        if (a > tempV) {
            ans = "F"
            flg = false
        } else if (a + b > tempV) {
            ans = "M"
            flg = false
        } else if (a + b + c > tempV) {
            ans = "T"
            flg = false
        }
        tempV = tempV - sumABC
    }
    
    println(ans)
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