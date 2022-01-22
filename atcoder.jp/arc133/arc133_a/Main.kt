fun main() {
    val n = readInt()
    val list = readInts().toList()
    var temp = list[0]
    var eliminateNumber = -1
    
    for(i in 1..n - 1){
        if(list[i] < temp) {
            eliminateNumber = temp
            break
        } else {
            temp = list[i]
        }
    }
    
    if(eliminateNumber == -1) eliminateNumber = list[n-1]
    
    val ansList = list.filter{ it != eliminateNumber }
    
    println(
        ansList.joinToString(separator = " ")
    )
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
