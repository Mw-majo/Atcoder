fun main() {
    
    //入力
    val a = readLine()?.toInt()?:0
    val b = readLine()?.toInt()?:0
    val c = readLine()?.toInt()?:0
    val x = readLine()?.toInt()?:0
    val coinFiveHundred = 500
    val coinOneHundred = 100
    val coinFifty = 50
    
    var answer = 0
    
    var culcurationResult = 0
    
    //処理
    for ( aNum in 0..a ){
        //明らかに金額を超える場合を除外
        if (aNum*coinFiveHundred > x) continue
        for ( bNum in 0..b ){
            if (aNum*coinFiveHundred + bNum*coinOneHundred > x) continue
            for ( cNum in 0..c ){
                culcurationResult = aNum*coinFiveHundred + bNum*coinOneHundred + cNum*coinFifty
                if ( culcurationResult == x ){
                    answer++
                }
            }
        }
    }
    //出力
    println(answer)
}
