fun main() {
    val (n, k, a) = readInts()
    
    val amari = k % n
    println(
        if( a + amari - 1 > 0) {
            if (a + amari - 1 <= n){
                a + amari - 1
            } else {
                a + amari - n - 1
            }
        } else {
            a + amari + n - 1 
        }
    )
    
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
