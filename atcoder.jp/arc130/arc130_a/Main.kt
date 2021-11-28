fun main() {
    readInt()
    val s = readStrings()
    
    var ans = 0L
    var temp = "="
    var count = 0L
    
    s.forEach { str ->
        count++
        if (temp != str) {
            ans += calculateCondition(count)
            temp = str 
            count = 0
        }
        
    }
    println(ans)
}

fun calculateCondition(count: Long) = if (count > 0) count * (count - 1L) / 2L else 0L

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split("")
private fun readInts() = readStrings().map { it.toInt() }
private fun readLongs() = readStrings().map { it.toLong() }
