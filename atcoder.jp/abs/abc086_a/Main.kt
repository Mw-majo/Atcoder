fun main(){
 val li = readLine()!!.split(" ").map(String::toInt)
 
 if(li.any { it % 2 == 0 }){
     println("Even")
 }else{
     println("Odd")
 }
}