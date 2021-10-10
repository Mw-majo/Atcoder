fun main() {
    
    //入力
    val list = readLine()!!.split(" ").map(String::toInt)
    
    //処理
    val answerList = calcuateOtoshidamaManeyNumber(list).toList()
    
    //出力
    println(
        answerList.joinToString(separator = " ") { it.toString() }
    )
}

fun calcuateOtoshidamaManeyNumber(list : List<Int>) : Triple<Int, Int, Int>{
    //お金の種類
    val valueX = 10
    val valueY = 5
    val valueZ = 1
    
    var x = -1; var y = -1; var z = -1
    
    //枚数と総額
    val n = list[0]
    val t = list[1]
    
    val needNum = t / 1000
            
    //計算
    for (xx in 0..n){
        val yy : Int = Math.abs(( needNum - n - (valueX - 1) * xx ) / 4)
        val zz : Int = Math.abs(( 5 * n + 5 * xx - needNum ) / 4)
        
        if (( xx * valueX + yy * valueY + zz * valueZ == needNum ) && ( xx + yy + zz == n )){
            x = xx
            y = yy
            z = zz
            break;
        }
    }
    return Triple(x, y, z)
}