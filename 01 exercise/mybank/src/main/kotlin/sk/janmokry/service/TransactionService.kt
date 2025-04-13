package sk.janmokry.service

import sk.janmokry.model.Transaction
import java.time.Instant
import java.util.*
import java.util.concurrent.CopyOnWriteArrayList

class TransactionService() {
    private val transactions: MutableList<Transaction> = CopyOnWriteArrayList()

    fun findAll(): List<Transaction> {
        return transactions
    }

    fun create(amount: Int, reference: String): Transaction =
        Transaction(
            id = UUID.randomUUID().toString(),
            amount = amount,
            timestamp = Date.from(Instant.now()),
            reference = reference,
        )
            .also { transactions += it }
}
