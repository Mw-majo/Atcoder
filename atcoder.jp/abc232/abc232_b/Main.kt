fun main() {
    val s = readLn()
    val t = readLn()
    val SHIFT_COUNT = s.codePointAt(0)-t.codePointAt(0)
    
    println( if(encryptFold(s.toString(), SHIFT_COUNT) == t.toString()) {
        "Yes"
    } else {
        "No"
    })
}


private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split("").filter{it!=""}
private fun readInts() = readStrings().map { it.toInt() }
private fun readLongs() = readStrings().map { it.toLong() }

fun encryptFold(plainText: String, shift: Int): String =
    plainText.fold(StringBuilder()) { acc, c ->
        val a = 'a'
        acc.append(
            if(c - shift >= 'a'){
                if (c - shift <= 'z') c - shift
                else c - shift - 26
            } else {
                c - shift + 26
            }
        )
    }.toString()