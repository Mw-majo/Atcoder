fun main() {
    readInt()
    val li = readInts().sorted().distinct()
    val t = readInt()
    val list = li.map { (it/t).toInt() }.distinct()
 
    println(list.size)
}

private fun readInt() = readLine()!!.toInt()
private fun readInts() = readLine()!!.split(" ").map(Integer::parseInt)
