fun main() {
    val n = readInt()
    val studentList = mutableListOf<List<Int>>()
    repeat(n) {
        studentList.add(readInts())
    }
    val studentNumberList = 0..n - 1
    
    var sumOne = 0
    val cumulativeSumListOne = studentNumberList.map {
        if (studentList[it][0] == 1) sumOne += studentList[it][1]
        sumOne
    }
    var sumTwo = 0
    val cumulativeSumListTwo = studentNumberList.map {
        if (studentList[it][0] == 2) sumTwo += studentList[it][1]
        sumTwo
    }   
        
    
    val q = readInt()
    val queryList = mutableListOf<List<Int>>()
    repeat(q) {
        queryList.add(readInts())
    }
    
    val queryNumberList = 0..q - 1
    
    println(
        queryNumberList.map {
            val (L, R) = queryList[it]
            val classOneSum = cumulativeSumListOne[R - 1] - if (L > 1) cumulativeSumListOne[L - 2] else 0
            val classTwoSum = cumulativeSumListTwo[R - 1] - if (L > 1) cumulativeSumListTwo[L - 2] else 0
            //val classTwoSum = if (R < 20) cumulativeSumListOne[R] else cumulativeSumListOne[19] - if (L > 1) cumulativeSumListOne[L - 1] else 0 
            val answerList = mutableListOf<Int>()
            answerList.add(classOneSum)
            answerList.add(classTwoSum)
            //answerList.addAll(cumulativeSumListOne)
            answerList.joinToString(separator = " ") { it.toString() }
        }.joinToString(separator = "\n") { it.toString() }
        //"aaa"
        /*sumList.joinToString(separator = "\n") { list ->
            list.joinToString(separator = " ") { classSum ->
                classSum.toString()
            }
        }*/
    )
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }
