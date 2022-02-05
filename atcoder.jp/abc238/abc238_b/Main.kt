fun main() {
    val n = readInt()
    val inputAngleList = readInts()
    
    var tempAngle = 0
    var tempAngle2 = 0
    
    val angleList = mutableListOf(0)
    angleList.addAll(
        inputAngleList.map {
            tempAngle += it
            val spot = tempAngle % 360
            spot
        }
    )
    angleList.add(360)
    angleList.sort()
    val maxAngle = angleList.map {
        val angle = it - tempAngle2
        tempAngle2 = it
        angle
    }.max()
    
    println(maxAngle)
    
    
    
    
    /*val n = readInt()
    val nameList = mutableListOf<String>()
    val hashNameMap = hashMapOf<String, Int>()
    
    for (i in 1..n) {
        val inputName = readLn()
        nameList.add(inputName)
        if (!hashNameMap.containsKey(inputName)) hashNameMap.put(inputName, i)
    }
    
    //println(hashNameMap)
    for (i in 0..n - 1) {
        val name = nameList[i]
        val day = hashNameMap.get(name)
        if (day != null) {
            hashNameMap.remove(name)
            println(day)
        }
    }*/
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
