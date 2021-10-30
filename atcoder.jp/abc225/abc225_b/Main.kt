fun main() {
    val n = readInt()
    val list = mutableListOf<Int>()
    
    var a = 0
    var b = 0
    
    var acount=0
    var bcount=0
    
    
    var flg = false
    
    for(i in 0..n-2){
        val ab = readInts()
        list.add(ab[0])
        list.add(ab[1])
    }
    
    a=list[0]
    b=list[1]
    list.forEach{ 
        if(it==a) acount++
        if(it==b) bcount++
    }
    
    if(acount==n-1)flg=true
    if(bcount==n-1)flg=true
    
    if(flg){
        println("Yes")
    }else{
        println("No")
    }
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }