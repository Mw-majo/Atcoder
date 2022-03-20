fun main() {
    val n = readInt()
    val max = 2 * n + 1
    val min = 1
    
    val ansList = List(2 * n) { it + 1 }
    val usedList = mutableListOf<Int>()
    
    for (i in 0..n) {
        var ans = 0
        for (j in min..max) {
            if (!usedList.contains(j)) {
                ans = j
                usedList.add(j)
                break
            }
        } 
        println(ans)
        usedList.add(readInt())
    }
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