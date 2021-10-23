

import java.io.IOException
import java.io.InputStream
import java.lang.NumberFormatException
import java.lang.StringBuilder
import java.util.*
import kotlin.NoSuchElementException

import kotlin.collections.ArrayList
import kotlin.collections.HashSet
import kotlin.math.*



fun main(){
    val n = readInt()
    val xList = ArrayList<Int>()
    val yList = ArrayList<Int>()
    
    var flg=false
    
    var answer = 0
    
    //
    for (i in 0 until n){
        val xy = readInts()
        val x = xy[0]
        val y = xy[1]
        xList.add(x)
        yList.add(y)
    }
    
    //
    for (i in 0 until n){
        for (k in i+1 until n){
            val y1 = yList[i]-yList[k]
            var x1 = xList[i]-xList[k]
            var a :Double = 0.0
            flg = false
            if ( x1==0 ) flg=true
            else a = y1.toDouble() / x1.toDouble()
            
            for (m in k+1 until n){
                val y2 = yList[m]-yList[k]
                var x2 = xList[m]-xList[k]
                var aa :Double = 0.0
                if (x2==0){
                    if(!flg)answer++
                }
                else {
                    aa = y2.toDouble() / x2.toDouble()
                    if( a != aa || flg ) answer++
                    
                }
            }    
        }
    }

    println(answer)
}





private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
