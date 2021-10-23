

import java.io.IOException
import java.io.InputStream
import java.lang.NumberFormatException
import java.lang.StringBuilder
import java.util.*
import kotlin.NoSuchElementException

import kotlin.collections.ArrayList
import kotlin.collections.HashSet
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min



fun main(){
    val hw = readInts()
    
    val h = hw[0]
    val w = hw[1]
    val list = Array(h){ArrayList<Int>()}
    
    var flg = true
    
    //
    for (i in 0 until h){
        val aList = readInts()
        for (k in 0 until w){
            list[i].add(aList[k])
        }
    }

    for (i in 0 until h){
        for (ii in i+1 until h){
            for (k in 0 until w){
                for (kk in k+1 until w){
                    if(list[i][k]+list[ii][kk]>list[i][kk]+list[ii][k])flg=false
                    if(!flg)break
                }
                if(!flg)break
            }
            if(!flg)break
        }
        if(!flg)break
    }

    if(flg){
        println("Yes")
    }else{
        println("No")
    }
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }


