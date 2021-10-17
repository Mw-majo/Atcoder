fun main(){
    var x = readInt()
    
    if (x % 100 == 0 && x != 0) println("Yes")
    else println("No")
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
