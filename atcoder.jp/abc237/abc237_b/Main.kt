fun main() {
    val (h, w) = readInts()
    
    val list = mutableListOf<List<Int>>()
    repeat(h) {
        list.add(readInts())
    }
    
    println(
        (0..w - 1).joinToString(separator = "\n") { x ->
            (0..h - 1).joinToString(separator = " ") { y ->
                list[y][x].toString()
            }
        }
    )
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
