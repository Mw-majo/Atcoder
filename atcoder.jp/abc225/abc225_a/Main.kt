fun main() {
    val s = readStrings()
    var count = 0
    if(s[1]==s[2])count++
    if(s[2]==s[3])count++
    if(s[3]==s[1])count++
    
    if(count==0){
        println(6)
    }else if(count==1){ 
        println(3)
    }else{ 
        println(1)
    }
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split("")
private fun readInts() = readStrings().map { it.toInt() }
