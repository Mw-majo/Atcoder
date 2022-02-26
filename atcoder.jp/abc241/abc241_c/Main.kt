import kotlin.math.abs

fun main() {
    val n = readInt()
    val allList = mutableListOf<CharArray>()
    var isSixConnect = false
    for (i in 0..n - 1) {
        allList.add(readLn().toCharArray())
    }
    
    for (y in 0..n - 1) {
        for (x in 0..n - 1) {
        //println("${x} ${y}")
            if (x <= n - 6) {
                if ((0..5).count { allList[y][x + it] == '#' } >= 4) isSixConnect = true
            }
            if (y <= n - 6) {
                if ((0..5).count { allList[y + it][x] == '#' } >= 4) isSixConnect = true
            }
            if ((x <= n - 6) && (y <= n - 6)) {
                if ((0..5).count { allList[y + it][x + it] == '#' } >= 4) isSixConnect = true
                if ((0..5).count { allList[y - it + 5][x + it] == '#' } >= 4) isSixConnect = true
            }    
        }
    }
    
    println( 
        if (isSixConnect) "Yes" else "No" 
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
