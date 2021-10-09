fun main() {
    
    //入力
    val n = readLine()?.toInt()?:0
    val list = readLine()!!.split(" ").map(String::toInt)
    var answer = 0
    
    //処理
    val sortedList = list.sortedDescending()
    
    for (i in 0..n-1){
        if (i % 2 == 0){
            answer += sortedList[i]
        }else{
            answer -= sortedList[i]
        }
    }
    
    
    //出力
    println(Math.abs(answer))
}
