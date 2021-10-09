fun main(){
  //入力
  val a = readLine()?.toInt()?:0
  val li = readLine()!!.split(" ").map(String::toInt)
  val bcList = li.filterNotNull()
  val s = readLine()
  
  //出力
  println(String.format("%d %s", a+bcList.sum(), s))  
}