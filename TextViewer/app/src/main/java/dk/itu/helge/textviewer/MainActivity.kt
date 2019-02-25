package dk.itu.helge.textviewer

// Android with Kotlin in Kotlin style:
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = resources.getString(R.string.fst_paragraph)
        textView.text = text
    }
}

/*
// Android with Kotlin in Java style:
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        val text = resources.getString(R.string.fst_paragraph)
        textView?.text = text
    }
}
*/