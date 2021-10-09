fun main() {
    
    //入力
    val list = readLine()!!.split(" ").map(String::toInt)
    val n = list[0]
    val a = list[1]
    val b = list[2]
    
    var answer = 0
    
    var culculationResult = 0
    
    //処理
    for ( i in 1..n ){
    
        culculationResult = getTenRemainder(i) 
        
        if(( culculationResult >= a ) && ( culculationResult <= b )){
            answer += i
        }
        
    }
    //出力
    println(answer)
}

//10000までの値の各桁の値の和を返す
fun getTenRemainder(i : Int) : Int{
    
    return numDiviate(i, 10000) % 10 + numDiviate(i, 1000) % 10 + numDiviate(i, 100) % 10 + numDiviate(i, 10) % 10 + i % 10
    
}

//iをdivで割った商を整数値で返す
fun numDiviate( i : Int, div : Int ) : Int{
    
    return Math.floor(i.toDouble() / div).toInt()

    
}