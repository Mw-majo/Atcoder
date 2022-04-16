fun main(args: Array<String>) {
    val list = List(10) { it }
    
    val input = readCharArray().map { Character.getNumericValue(it) }
    
    val a = list.minus(input)
    //println(list)
    println(a[0])
    
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readInts() = readStrings().map(String::toInt)
private fun readStrings() = readLn().split(" ")
private fun readCharArray() =  readLn().toCharArray()