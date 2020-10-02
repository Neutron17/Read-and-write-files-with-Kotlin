import java.io.BufferedInputStream
import java.io.FileInputStream

class Reader {
    /** Read a single char from a file */
    fun readSingleChar() {
        try {
            val fis = FileInputStream("path") // File path
            val i = fis.read()
            println(i.toChar())
            fis.close()
        } catch (ex: Exception) {
            println("" + ex)
        }
    }
    /** Read multiple chars from a file */
    fun readMultipleChar() {
        try {
            val fis = FileInputStream("path") // File path
            var i = 0
            var result = ""
            while (fis.read().also { i = it } != -1) {
                result += i.toChar()
            }
            println(result)
            fis.close()
            println("Kész")
        } catch (ex: Exception) {
            println("" + ex)
        }
    }
    /** Read multiple chars with buffer */
    fun bufferedReader() {
        try {
            val fis = FileInputStream("path") // File path
            val bin = BufferedInputStream(fis)
            var i = 0
            var result = ""
            while (bin.read().also { i = it } != -1) {
                result += i.toChar()
            }
            println(result)
            fis.close()
        } catch (ex: Exception) {
            println("" + ex)
        }
    }
}