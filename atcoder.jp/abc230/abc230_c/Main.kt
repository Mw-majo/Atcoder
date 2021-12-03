fun main() {
    val (n, a, b) = readLongs()
    val (p, q, r, s) = readLongs()
    
    val kmin1 = if (a < b) 1 - a else 1 - b
    val kmin2 = if (1 - a > b - n) 1 - a else b - n
    val kmax1 = if (a < b) n - b else n - a
    val kmax2 = if (n - a > b - 1) b - 1 else n - a
    
    fun checkIn(y: Long, x: Long) : String{
        val flg1 = (a + kmin1 <= y) && (y <= a + kmax1) && (b + kmin1 <= x) && (x <= b + kmax1) && (y - a == x - b)
        val flg2 = (a + kmin2 <= y) && (y <= a + kmax2) && (b - kmin2 >= x) && (x >= b - kmax2) && (y - a == b - x)
        
        return if (flg1 || flg2) "#" else "."
    }
    
    val listX = mutableListOf<Long>()
    for (i in r..s) listX.add(i)
    val listY = mutableListOf<Long>()
    for (i in p..q) listY.add(i)
        
    println(
        listY.map { y ->
            listX.map { x ->
                checkIn(y, x)
            }.joinToString(separator = "")
        }.joinToString(separator = "\n")
    )
    
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
private fun readLongs() = readStrings().map { it.toLong() }
