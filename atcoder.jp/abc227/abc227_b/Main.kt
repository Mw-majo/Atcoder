fun main() {
    val n = readInt()
    val sList = readInts()
    
    var ans = 0
    
    val ansList = mutableListOf<Int>()
    var a = 1
    var b = 1
    var temp = 0
    var flg = true
    
    while (flg){
        temp = 4 * a * b + 3 * (a + b)
        ansList.add(temp)
        if ((a == 1) && (temp>=1000)) {
            flg = false
        }
        if(a == b) {
            a = 1
            b++
        } else {
            a++
        }
    }
    
    for (s in sList){
        if (!(s in ansList)) ans++
    }

    println(ans)
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
