package dk.itu.helge.textreader

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import java.io.IOException
import java.nio.charset.Charset
// With this import, you can use the ids from your activity as variables directly
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the application's resources
        //resources = getResources()
        var completeText = ""
        try {
            // completeText = loadTxtFile("mobydick", true);
            completeText = loadTxtFile("mobydick.txt", false)
        } catch (e: IOException) {
            // display an error toast message
            val toast = Toast.makeText(this, "File: not found!", Toast.LENGTH_LONG)
            toast.show()
        }

        val wordCounter = WordCounter(completeText)
        val numberOfWords = wordCounter.count().toString()

        text_view.text = completeText

        val dialogArgs = Bundle()
        dialogArgs.putString("noWords", numberOfWords)
        val dialog = WordCountDialog()
        dialog.arguments = dialogArgs

        dialog.show(supportFragmentManager, "wordCountDialogFragment")

    }


    /**
     * Load the contents of a text file from the application's res/raw folder or assets folder.
     *
     * @param  fileName Name of the text file in the raw or assets folder
     * @param  loadFromRawFolder indicator if text file shall be read from raw folder (True) or from
     * assets folder (False)
     * @return Returns the contents of the text file as String
     */
    @Throws(IOException::class)
    fun loadTxtFile(fileName: String, loadFromRawFolder: Boolean): String {
        // Create an InputStream to read the file into
        val inputStream =  if (loadFromRawFolder) {
            // get the resource id from the file name
            val resourceID = resources.getIdentifier("dk.itu.helge.textreader:raw/$fileName",
                null, null)
            // get the file as a stream
            resources.openRawResource(resourceID)
        } else {
            // get the file as a stream
            resources.assets.open(fileName)
        }

        val content = inputStream.readBytes().toString(Charset.defaultCharset())
        inputStream.close()

        // return the output stream as a String
        return content
    }
}