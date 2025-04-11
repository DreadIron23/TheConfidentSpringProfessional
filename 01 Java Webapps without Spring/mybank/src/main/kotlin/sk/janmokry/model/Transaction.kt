package sk.janmokry.model

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*

data class Transaction(
    val id: String = UUID.randomUUID().toString(),
    val amount: Int,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm'Z'")
    val timestamp: Date,
    val reference: String,
)
