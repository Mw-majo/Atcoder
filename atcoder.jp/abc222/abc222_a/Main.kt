fun main() {
    
    //入力
    var n = readLine()?.toInt()?:0
    var answer : String = ""
    
    //処理
    when{
        n < 10 ->{
            answer = String.format("000%d",n)
        }
        n < 100 ->{
            answer = String.format("00%d",n)
        }
        n < 1000 ->{
            answer = String.format("0%d",n)
        }
        else ->{
            answer = String.format("%d",n)
        }
    }
    
    //出力
    println(answer)
}