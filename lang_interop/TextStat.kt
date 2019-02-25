import WordCounter
import java.io.File


fun main(args: Array<String>) {
    val fileName = args[0]
    val contentTxt = File(fileName).readText()
    val fstParagraph = contentTxt.slice((28650..29772))

    println(fstParagraph)
    println("Contains ${WordCounter(fstParagraph).count()} words.")
}