package sk.janmokry.myfancypdfinvoices.springboot.web;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import sk.janmokry.myfancypdfinvoices.springboot.dto.InvoiceDto;
import sk.janmokry.myfancypdfinvoices.springboot.model.Invoice;
import sk.janmokry.myfancypdfinvoices.springboot.service.InvoiceService;

@RestController
public class InvoicesController {

    private final InvoiceService invoiceService;

    public InvoicesController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/invoices")
    // @RequestMapping(value = "/invoices", method = RequestMethod.GET)
    public Iterable<Invoice> invoices() {
        return invoiceService.findAll();
    }

    @GetMapping("/invoices/user/{userId}")
    public Iterable<Invoice> getInvoicesByUserId(@PathVariable String userId) {
        return invoiceService.findByUserId(userId);
    }

    @PostMapping("/invoices")
    public Invoice createInvoice(@Valid @RequestBody InvoiceDto invoiceDto) {
        return invoiceService.create(invoiceDto.getUserId(), invoiceDto.getAmount());
    }
}
