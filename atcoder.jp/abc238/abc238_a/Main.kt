fun main() {
    val n = readInt()
    
    println(
        when(n){
            1 -> "Yes"
            2 -> "No"
            3 -> "No"
            4 -> "No"
            5 -> "Yes"
            else -> "Yes"
        }
    
    )
    
    
    
    
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
