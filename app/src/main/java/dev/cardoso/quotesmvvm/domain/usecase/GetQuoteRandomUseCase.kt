package dev.cardoso.quotesmvvm.domain.usecase

import dev.cardoso.quotesmvvm.data.local.daos.QuoteDAO
import dev.cardoso.quotesmvvm.data.model.QuoteModel
import dev.cardoso.quotesmvvm.domain.QuoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetQuoteRandomUseCase @Inject constructor (quoteDAO: QuoteDAO,
                                                 private val quoteRepository: QuoteRepository) {
   // private val quoteRepository = QuoteRepositoryImpl(quoteDAO)

    suspend fun getQuoteRandom(): Flow<QuoteModel> = quoteRepository.getQuoteRandom()

}