fun main(args: Array<String>) {
    val n = readInt()
    val ansList = mutableListOf<Int>()
    
    val sb = StringBuilder()
    
    for (i in 1..n) {
        val tempList: List<Int> = ansList.toList()
        ansList.add(i)
        ansList.addAll(tempList)
        
        //println(tempList.joinToString(separator = " "))
    }
    
    for (i in ansList) {
        sb.append(i)
    }
    
    
    
    println(ansList.joinToString(separator = " "))
}

private fun readInt() = readLine()!!.toInt()
private fun readDouble() = readLine()!!.toDouble()
private fun readNInts(n: Int) = readLine()!!.split(" ").subList(0, n).map(String::toInt)
private fun readInts() = readLine()!!.split(" ").map(String::toInt) 
private fun readStrings() = readLine()!!.split(" ")