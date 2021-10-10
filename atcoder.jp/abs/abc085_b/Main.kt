fun main() {
    
    //入力
    val n = readLine()?.toInt()?:0
    val list = List(n){
        readLine()!!.toInt()
    }
    
    var answer = 1
    
    //処理
    val sortedList = list.sortedDescending()
    var currentMaxSize = sortedList[0]
    
    for (i in 1..n-1){
        if (sortedList[i] < currentMaxSize){
            answer++
            currentMaxSize = sortedList[i]
        }
    }
    
    
    //出力
    println(answer)
}
