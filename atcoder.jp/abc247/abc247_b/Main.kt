fun main(args: Array<String>) {
    val n = readInt()
    
    val list = mutableListOf<String>()
    var flg = false
    
    val okList = mutableListOf<Boolean>()
    
    for (i in 0..n - 1) {
        val input = readStrings()
        list.add(input[0])
        okList.add(false)
        list.add(input[1])
        okList.add(false)
    }
    
    //println(list)
    
    for (i in 0..n - 1) {
        val num = i * 2
        val tempList = list.withIndex().filter { it.index != num && it.index != num + 1 }.map { it.value }
        //println("${i}: ${tempList}")
        //println("${num}: ${list[num]}")
        //println("${num}: ${list[num]}")
        
        if (tempList.contains(list[num])) okList[num] = true
        if (tempList.contains(list[num + 1])) okList[num + 1] = true
    }
    
    for (i in 0..n - 1) {
        val num = i * 2
        if (okList[num] && okList[num + 1]) {
            flg = true
            break
        }
    }
    
    println(if (flg) "No" else "Yes")
}

private fun readInt() = readLine()!!.toInt()
private fun readDouble() = readLine()!!.toDouble()
private fun readNInts(n: Int) = readLine()!!.split(" ").subList(0, n).map(String::toInt)
private fun readInts() = readLine()!!.split(" ").map(String::toInt) 
private fun readStrings() = readLine()!!.split(" ")