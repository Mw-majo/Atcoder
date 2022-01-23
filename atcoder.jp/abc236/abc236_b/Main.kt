fun main() {
    val n = readInt()
    val cardList = readInts()
    
    var countList: MutableList<Int> = MutableList(n) { 0 }
    
    cardList.forEach{ i ->
        countList[i - 1]++
    }
    
    val index = countList.indexOfFirst{it != 4}
    val ans = index + 1
    
    println(ans)
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

private fun makeDivisorList(n: Int) = (1..n).filter{ n % it == 0 }

    