package rest.rest2.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.rest2.Entity.Contact;
import rest.rest2.Service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contact")
    ResponseEntity<List<Contact>> getAllContact() {
        List<Contact> contacts = contactService.getAllContact();

        return ResponseEntity.ok(contacts);
    }
}
