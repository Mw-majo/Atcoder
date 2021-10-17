fun main(){
    var n = readInt()
    val aList = mutableListOf<Int>()
    val bList = mutableListOf<Int>()
    val timeList = mutableListOf<Float>()
    
    var fullTime = 0.0f
    var fullLength = 0
    
    for (i in 0..n-1){
        val ab = readInts()
        val time = ab[0].toFloat()/ab[1].toFloat()
        fullTime += time
        fullLength += ab[0]
        
        timeList.add(time)
        aList.add(ab[0])
        bList.add(ab[1])
    }
    
    val answerTime :Float = fullTime / 2
    
    var timeCal = 0.0f
    var lengthCal = 0.0f
    for (i in 0..n-1){
        val car=timeCal
        timeCal+=timeList[i]
        if(timeCal >= answerTime){
            val t = answerTime - car 
            lengthCal+=(t*bList[i]).toFloat()
            
            break   
        }else{
            lengthCal+=aList[i].toFloat()
        }
    }
    
    println(lengthCal)
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
