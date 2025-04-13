package sk.janmokry.web

import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import sk.janmokry.context.Application
import sk.janmokry.model.Transaction

class MyBankServlet: HttpServlet() {
    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        if (request.requestURI.equals("/transactions", ignoreCase = true)) {

            val amount = request.getParameter("amount").toInt()
            val reference = request.getParameter("reference")

            val transaction = Application.transactionService.create(amount, reference)

            val json = Application.jacksonObjectMapper.writeValueAsString(transaction)
            response.apply {
                contentType = "application/json; charset=UTF-8"
                writer.print(json)
            }
        } else {
            response.status = HttpServletResponse.SC_NOT_FOUND
        }
    }

    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        if (request.requestURI.equals("/transactions", ignoreCase = true)) {
            val transactions: List<Transaction> = Application.transactionService.findAll()

            response.apply {
                contentType = "application/json; charset=UTF-8"
                writer.print(Application.jacksonObjectMapper.writeValueAsString(transactions))
            }
        } else {
            response.status = HttpServletResponse.SC_NOT_FOUND
        }
    }
}