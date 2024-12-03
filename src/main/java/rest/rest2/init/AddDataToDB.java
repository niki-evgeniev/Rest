package rest.rest2.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rest.rest2.Entity.Contact;
import rest.rest2.Repository.ContactRepository;

@Component
public class AddDataToDB implements CommandLineRunner {

    private final ContactRepository contactRepository;

    public AddDataToDB(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (contactRepository.count() == 0) {
            Contact contact = new Contact();
            contact.setFirstName("test");
            contact.setLastName("testov");
            contact.setAddress("address");
            contact.setEmail("test@test");
            contactRepository.save(contact);
        }
    }
}
