package br.com.luana.nybooksmvvm.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.luana.nybooksmvvm.R
import br.com.luana.nybooksmvvm.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksAdapter(
    private val books: List<Book>,
val onItemClickListener: ((book:Book) -> Unit)
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(itemView, onItemClickListener)
    }

    override fun onBindViewHolder(viewHolder: BooksViewHolder, position: Int) {
    viewHolder.bindView(books [position] )
    }

    override fun getItemCount() = books.count()

    class BooksViewHolder(
        itemView: View,
        private val onItemClickListener: ((book:Book) -> Unit)
    ) : RecyclerView.ViewHolder(itemView) {

        private val title = itemView.textTitle
        private val author = itemView.textAuthor

        fun bindView(book: Book) {
            title.text = book.title
            author.text = book.author

            itemView.setOnClickListener{
                onItemClickListener.invoke(book)
            }
        }

    }
}