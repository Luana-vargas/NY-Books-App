package br.com.luana.nybooksmvvm.data.response

import br.com.luana.nybooksmvvm.data.model.Book
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookDetailsResponse(
    val title: String,
    val author: String,
    val description: String
) {

    fun getBookModel() = Book(
        title = this.title,
        author = this.author,
        description = this.description
    )
}

