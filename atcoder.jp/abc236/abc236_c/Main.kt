import java.io.PrintWriter
fun main() {
    val writer = PrintWriter(System.out, false)
    writer.sub()
    writer.flush()
}
fun PrintWriter.sub() {
    val (n, m) = readInts()
    val sList = readStrings()
    val tList = readStrings()
    
    var i = 0
    
    println(
        sList.joinToString(separator = "\n"){
            if(tList[i] == it) {
                i++
                "Yes"
            } else {
                "No"
            }
        }
    )
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
    