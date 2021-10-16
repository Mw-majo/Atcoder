fun main() {
    //input
    val nlList = readLine()!!.split(" ").map(String::toInt)
    val k = readLine()!!.toInt()
    val aListIn = readLine()!!.split(" ").map(String::toInt)
    val aList = aListIn.toMutableList()
    
    aList.add( nlList[1] )
    
    var left = 0
    var right = nlList[1]
    
    // process
    while ( left+1 < right ){
        val temp = (left + right) / 2
        var cnt = 0
        var last = 0
        for (i in 0..nlList[0]){
            if (cnt >= k + 1) break
            if (aList[i] - last >= temp){
                cnt++
                last = aList[i]
            }
        }
        if (cnt >= k + 1){
            left = temp
        } else {
            right = temp
        }
    }
    
    // output
    println(left)
}