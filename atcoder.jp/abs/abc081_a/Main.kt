fun main(args: Array<String>) {
    
    val inp = readLine()!!
    val numOne = inp.chunked(1).filter { it == "1" }
    
    println(numOne.size)
}
