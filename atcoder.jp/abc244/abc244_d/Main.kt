fun main() {
    val (s1, s2, s3) = readStrings()
    val (t1, t2, t3) = readStrings()
    var count = 0
    if (s1 == t1) count++
    if (s2 == t2) count++
    if (s3 == t3) count++
    
    println(
        if (count == 0 || count == 3) "Yes"
        else "No"
    )
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