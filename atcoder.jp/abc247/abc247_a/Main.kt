fun main(args: Array<String>) {
    val n = readLine()!!.toCharArray()
    
    val list = n.map { 
        Character.getNumericValue(it)
    }
    
    print(0)
    print(list[0])
    print(list[1])
    println(list[2])
    
}

private fun readInt() = readLine()!!.toInt()
private fun readDouble() = readLine()!!.toDouble()
private fun readNInts(n: Int) = readLine()!!.split(" ").subList(0, n).map(String::toInt)
private fun readInts() = readLine()!!.split(" ").map(String::toInt) 
