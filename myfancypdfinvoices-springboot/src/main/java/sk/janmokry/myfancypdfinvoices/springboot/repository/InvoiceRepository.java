package sk.janmokry.myfancypdfinvoices.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import sk.janmokry.myfancypdfinvoices.springboot.model.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, String> {
}
