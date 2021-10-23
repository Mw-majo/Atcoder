fun main(){
    //
    val t = readLn()
    
    var flg=false
    //
    if(t.takeLast(2)=="er")flg=true
    
    
    //
    if (flg)println("er")
    else println("ist")
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
