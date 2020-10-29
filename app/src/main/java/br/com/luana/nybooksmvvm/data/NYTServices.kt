package br.com.luana.nybooksmvvm.data

import retrofit2.Call
import retrofit2.http.GET

interface NYTServices {
    @GET("lists.json")
    fun listRepos(): Call<List<>?>?
}