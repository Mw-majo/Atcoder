fun main() {
    val (n, m) = readInts()
    
    var temp = 0
    var flg = true
    
    for(i in 1..n){
        val status = readInts()
        if(i==1) {
            temp=status[0]
        } else {
            if(temp+7==status[0]){
                temp=status[0]
            } else {
                flg=false
                break
            }
        }
        val tempjoyo=(temp-1)%7
        for(k in 1..m-1){
            val curjoyo=(status[k]-1)%7
            if(status[k]!=temp+k){
                flg=false
                break
            }
            if(tempjoyo>curjoyo){
                flg=false
                break
            }
        }
        if(!flg)break
    }
    
    if(flg) println("Yes")
    else println("No")
}

private fun getIjStatus(i: Int, j: Int) = (i - 1) * 7 + j

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }