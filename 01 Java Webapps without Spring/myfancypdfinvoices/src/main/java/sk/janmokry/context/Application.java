package sk.janmokry.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import sk.janmokry.service.InvoiceService;
import sk.janmokry.service.UserService;

public class Application {

    public static final UserService userService = new UserService();
    public static final InvoiceService invoiceService = new InvoiceService(userService);
    public static final ObjectMapper objectMapper = new ObjectMapper();
}
