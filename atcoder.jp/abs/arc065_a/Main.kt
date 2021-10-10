fun main() {
    
    val list = listOf("dreamer", "dream", "eraser", "erase")
    val checkList = listOf("dreamera", "dreamd", "dreamere", "dreamerd", "erased", "erasee", "eraserd", "erasere")
    
    var isContinue :Boolean
    
    //入力
    var s = readLine()
    if (s.isNullOrEmpty()) return
    
    var t :String = s
    
    
    //処理
    
    do {
        isContinue = false
        for (i in 0..checkList.size-1){
            if (t.length >= checkList[i].length){
                if ( t.substring(0, checkList[i].length) == checkList[i] ){
                    if ( i==0 ){
                        t = t.substring(checkList[i].length-3, t.length)
                    }else{
                        t = t.substring(checkList[i].length-1, t.length)
                    }
                    isContinue = true
                    break
                }
            }
        }
        if (!isContinue){
            for (k in 0..list.size-1){
                if (t.length >= list[k].length){
                    if ( t.substring(0, list[k].length) == list[k] ){
                        if (list[k].length == t.length) t = ""
                        else t = t.substring(list[k].length, t.length)
                        
                        isContinue = true
                        break
                    }
                }
            }
        }
    } while (isContinue)
    
    //出力
    if (t == ""){
        println("YES")
    } else {
        println("NO")
    }
}
