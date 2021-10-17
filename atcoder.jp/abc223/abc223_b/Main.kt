fun main(){
    var s = readLn()
    var first = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"
    var last = "a"
    for (i in 0..s.length-1){
        val list = mutableListOf<String>()
        var num = 0
        for (k in 0..s.length-1){
            if(i+k>s.length-1) num = i+k-s.length
            else num = i+k
            list.add(s.substring(num,num+1))
        }
        val temp = list.joinToString( separator = "")
        if (first.compareTo(temp) > 0)first=temp
        if (last.compareTo(temp) < 0)last=temp
    }
    println(first)
    println(last)
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split("")
private fun readInts() = readStrings().map { it.toInt() }
