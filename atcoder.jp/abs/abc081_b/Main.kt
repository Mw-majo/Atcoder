fun main() {
    
    //入力num
    val num : Int = readLine()?.toInt()?:0
    val li = readLine()!!.split(" ").map(String::toInt)
    val list = li.toMutableList()
    
    var answer = 0
    
    //２がいくつかけられてるか
    while ( list.all { it % 2 == 0 } ){
        for ( i in 0..num-1 ){
            list[i] = list[i] / 2
        }
        answer++
    }
    //出力
    println(answer)
}
