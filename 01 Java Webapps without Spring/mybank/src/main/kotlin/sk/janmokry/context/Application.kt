package sk.janmokry.context

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import sk.janmokry.service.TransactionService

object Application {
    val transactionService by lazy { TransactionService() }
    val jacksonObjectMapper by lazy {
        ObjectMapper().apply {
            disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
        }
    }
}