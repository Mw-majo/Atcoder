fun main() {
    val (s, t, x) = readInts()
    println ( 
        if (((s <= x) && (x <= t)) || ((s <= x) && (t < s)) || ((x < t) && (t < s))) "Yes"
        else "No"
    )
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
