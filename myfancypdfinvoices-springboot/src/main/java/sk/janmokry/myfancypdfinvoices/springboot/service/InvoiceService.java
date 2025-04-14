package sk.janmokry.myfancypdfinvoices.springboot.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sk.janmokry.myfancypdfinvoices.springboot.model.Invoice;
import sk.janmokry.myfancypdfinvoices.springboot.repository.InvoiceRepository;

@Component
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    private final String cdnUrl;

    public InvoiceService(InvoiceRepository invoiceRepository, @Value("${cdn.url}") String cdnUrl) {
        this.cdnUrl = cdnUrl;
        this.invoiceRepository = invoiceRepository;
    }

    @PostConstruct
    public void init() {
        System.out.println("Fetching PDF Template from S3...");
        // TODO download from s3 and save locally
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("Deleting downloaded templates...");
        // TODO actual deletion of PDFs
    }

    @Transactional
    public Iterable<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    @Transactional
    public Invoice create(String userId, Integer amount) {
        String generatedPdfUrl = cdnUrl + "/images/default/sample.pdf";

        Invoice invoice = new Invoice();
        invoice.setPdfUrl(generatedPdfUrl);
        invoice.setAmount(amount);
        invoice.setUserId(userId);

        return invoiceRepository.save(invoice);
    }
}
