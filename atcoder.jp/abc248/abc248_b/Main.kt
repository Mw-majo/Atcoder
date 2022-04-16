fun main(args: Array<String>) {
    val (a, b, k) = readInts()
    var aa = a.toLong()
    val kk = k.toLong()
    var count = 0L
    for (i in 0..100) {
        if (aa >= b) {
            count = i.toLong()
            break
        }
        aa = aa * kk
    }
    println(count)
    
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readInts() = readStrings().map(String::toInt)
private fun readStrings() = readLn().split(" ")
private fun readCharArray() =  readLn().toCharArray()