fun main() {
    
    //入力
    val npList = readLine()!!.split(" ").map(String::toInt)
    val list = readLine()!!.split(" ").map(String::toInt)
    
    var answer : Int = 0
    
    //処理
    for (i in 0..npList[0]-1){
        if (list[i] < npList[1]) answer++
    }
    
    //出力
    println(answer)
}