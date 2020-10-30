package br.com.luana.nybooksmvvm.data

import br.com.luana.nybooksmvvm.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "ZtCpAYbAgRaDrlqIJIbhULWSTk6PHnCR",
        @Query("list") list : String = "hardcover-fiction"

    ): Call<List<BookBodyResponse>>
}