fun main(){
  //ε₯ε
  val a = readLine()?.toInt()?:0
  val li = readLine()!!.split(" ").map(String::toInt)
  val bcList = li.filterNotNull()
  val s = readLine()
  
  //εΊε
  println(String.format("%d %s", a+bcList.sum(), s))  
}