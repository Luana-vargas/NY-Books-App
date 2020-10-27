package br.com.luana.nybooksmvvm.presentation.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.luana.nybooksmvvm.R
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = getString(R.string.books_title)
        setSupportActionBar(toolbarMain)


    }
}