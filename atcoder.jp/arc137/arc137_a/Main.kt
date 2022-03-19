import java.util.*

fun main() {
    var flag = false
    val (L, R) = readLongs()
    var ans = R - L
    var count = 0
    
    while (!flag) {
        for (i in 0..count) {
            if (gcd(R - i, L + count - i) == 1L) {
                ans = R - L - count
                flag = true
                break
            }
        }
        count++
        if (flag) break
    }
    
    println(ans)
 }

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
private fun readLongs() = readStrings().map { it.toLong() }


private fun readLineFaster(n: Int): List<String> {
    val reader = System.`in`.bufferedReader()
    val list = mutableListOf<String>()
    
    for (i in 1..n) list.add(reader.readLine()!!)
    
    val answer: List<String> = list
    return answer
}
private fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) {
        a
    } else {
        gcd(b, a % b)
    }
}