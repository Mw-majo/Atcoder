fun main() {
    
    var x = 0
    var y = 0
    var t = 0
    
    var isOk = true
    
    //入力
    var n = readLine()?.toInt()?:0
    
    var list = mutableListOf<List<Int>>() 
    for (i in 0..n-1){
        val dat : List<Int> = readLine()!!.split(" ").map(String::toInt)
        list.add(dat)
    }
    
    //処理
    for (i in 0..n-1){
        val elapsedTime = list[i][0] - t
        val movingDistanceX = Math.abs( list[i][1] - x )
        val movingDistanceY = Math.abs( list[i][2] - y )
        
        if ( !isGoingToDestination( elapsedTime, movingDistanceX, movingDistanceY ) ){
            isOk = false
            break
        }
        
        t = list[i][0]
        x = list[i][1]
        y = list[i][2]
    }
    
    //出力
    if (isOk){
        println("Yes")
    } else {
        println("No")
    }
}

fun isGoingToDestination(t : Int, x : Int, y : Int) : Boolean{
    if ( (x + y <= t) && ((t - x - y) % 2 == 0) ) return true
    else return false
}