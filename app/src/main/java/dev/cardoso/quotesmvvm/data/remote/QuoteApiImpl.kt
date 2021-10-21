package dev.cardoso.quotesmvvm.data.remote

import dev.cardoso.quotesmvvm.core.RetrofitHelper
import dev.cardoso.quotesmvvm.data.model.QuoteModel
import retrofit2.Response
import javax.inject.Inject

class QuoteApiImpl @Inject constructor(private val api: QuoteApi){
   // private val apiService: QuoteApi = RetrofitHelper.getRetrofit().create(QuoteApi::class.java)
    suspend fun getQuotes(): Response<List<QuoteModel>> {
        return api.getQuotes()
    }
}