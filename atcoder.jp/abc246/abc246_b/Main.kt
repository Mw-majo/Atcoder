fun main(args: Array<String>) {
    val (x, y) = readInts()
    
    val a: Double = if (x != 0) Math.atan(y.toDouble() / x.toDouble()) else Math.PI / 2.0
    
    val afterX = Math.cos(a)
    val afterY = Math.sin(a)
    
    println("${afterX} ${afterY}")
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