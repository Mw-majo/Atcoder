fun main() {
    val n = readInt()
    val aList = readInts()
    val bList = readInts()
    var hitNumber = 0
    var blowNumber = 0
    
    for ((index, a) in aList.withIndex()) {
        if (bList.contains(a)) {
            if (a == bList[index]) hitNumber++
            else blowNumber++
        }
    }
    
    println(hitNumber)
    println(blowNumber)
 }

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
private fun readLineFaster(n: Int): List<String> {
    val reader = System.`in`.bufferedReader()
    val list = mutableListOf<String>()
    
    for (i in 1..n) list.add(reader.readLine()!!)
    
    val answer: List<String> = list
    return answer
}