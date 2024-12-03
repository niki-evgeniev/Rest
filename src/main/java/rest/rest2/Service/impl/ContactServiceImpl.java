package rest.rest2.Service.impl;

import org.springframework.stereotype.Service;
import rest.rest2.Entity.Contact;
import rest.rest2.Repository.ContactRepository;
import rest.rest2.Service.ContactService;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<Contact> getAllContact() {
        List<Contact> all = contactRepository.findAll();
        return all;
    }
}
