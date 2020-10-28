package br.com.luana.nybooksmvvm.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.luana.nybooksmvvm.R
import br.com.luana.nybooksmvvm.data.model.Book

class BooksAdapter(
    val books: List<Book>
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(view)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
    }

    override fun getItemCount() = books.count()

    class BooksViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bindView(book: Book){
            
        }

    }
}