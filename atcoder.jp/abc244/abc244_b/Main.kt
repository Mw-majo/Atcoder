fun main() {
    val n = readInt()
    val t = readLn().toCharArray()
    var x = 0
    var y = 0
    var direction = 0
    
    for (str in t) {
        if (str == 'S') {
            when (direction) {
                0 -> {
                    x++
                }
                1 -> {
                    y--
                }
                2 -> {
                    x--
                }
                3 -> {
                    y++
                }
                else -> {
                    x = x
                    y = y
                }
            }
        } else {
            direction++
            if (direction >= 4) direction = 0
        }
    }
    
    
    println("${x} ${y}")
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