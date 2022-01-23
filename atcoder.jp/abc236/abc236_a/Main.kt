fun main() {
    val s = readLn()
    val (a, b) = readInts()
    
    val s1 = if(a != 1){
        s.substring(0, a - 1)
    } else {
        ""
    }
    val s2 = if(b - a != 1){
        s.substring(a, b - 1)
    } else {
        ""
    }
    val s3 = if(b != s.length){
        s.substring(b)
    } else {
        ""
    }
    
    val ans = s1 + s[b - 1] + s2 + s[a - 1] + s3
    
    println(ans)
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }

private fun makeDivisorList(n: Int) = (1..n).filter{ n % it == 0 }

    