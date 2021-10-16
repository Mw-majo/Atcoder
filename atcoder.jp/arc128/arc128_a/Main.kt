fun main() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map(String::toInt)
    
    val answer = mutableListOf<Int>()
    var mode = true
    var amount = 1
    
    //
    
    for (i in 0..n-2){
        //differenceList.add(list[i] - list[i-1])
        if (mode){
            if(list[i] - list[i+1] >= 0){
                amount = amount * list[i]
                answer.add(1)
                mode = false
            }else{
                answer.add(0)
            }
        }else{
            if(list[i] - list[i+1] <= 0){
                amount = amount / list[i]
                answer.add(1)
                mode = true
            }else{
                answer.add(0)
            }
        }
    }
    if (!mode){
        amount = amount * list[n-1]
        answer.add(1)
    }else{
        answer.add(0)
    }
    
    val str = answer.joinToString(separator = " ")
    //
    println(str)
}
