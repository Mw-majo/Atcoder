fun main(args: Array<String>) {
    val (x1, y1) = readInts()
    val (x2, y2) = readInts()
    val (x3, y3) = readInts()
    
    val x4 = if (x1 == x2) x3 else {
        if (x2 == x3) x1 else x2
    } 
    val y4 = if (y1 == y2) y3 else {
        if (y2 == y3) y1 else y2
    } 
    
    println("${x4} ${y4}")
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