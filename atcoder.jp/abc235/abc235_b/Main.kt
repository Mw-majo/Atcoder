fun main() {
    val n = readInt()
    val list = readInts()
    
    var ans = 0
    for (h in list) {
        if (ans < h){
            ans = h
        } else {
            break
        }
    }
    println(ans)
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }