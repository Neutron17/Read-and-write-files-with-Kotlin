import java.io.BufferedOutputStream
import java.io.FileOutputStream

class Writer {
    /** Write singe char to  file */
    fun writeSingleChar() {
        try {
            val fos = FileOutputStream("path")
            fos.write(/* Ascii code of a char example: 65 -> A */)
            fos.flush()
            fos.close()
        } catch (ex: Exception) {
            println("" + ex)
        }
    }
    fun writeMultipleChar(text: String) {
        try {
            val fos = FileOutputStream("path")
            val a = text.toByteArray()
            fos.write(a)
            fos.flush()
            fos.close()
        } catch (ex: Exception) {
            println("" + ex)
        }
    }
    /** Write multiple chars with buffer */
    fun bufferedWriter(text: String) {
        try {
            val fos = FileOutputStream("path")
            val bout = BufferedOutputStream(fos)
            val a = text.toByteArray()
            bout.write(a)
            bout.flush()
            bout.close()
        } catch (ex: Exception) {
            println("" + ex)
        }
    }
}
