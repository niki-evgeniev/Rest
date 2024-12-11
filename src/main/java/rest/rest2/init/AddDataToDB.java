package rest.rest2.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rest.rest2.Entity.Contact;
import rest.rest2.Entity.ToDo;
import rest.rest2.Repository.ContactRepository;
import rest.rest2.Repository.ToDoRepository;

@Component
public class AddDataToDB implements CommandLineRunner {

    private final ContactRepository contactRepository;
    private final ToDoRepository toDoRepository;

    public AddDataToDB(ContactRepository contactRepository, ToDoRepository toDoRepository) {
        this.contactRepository = contactRepository;
        this.toDoRepository = toDoRepository;
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
        if (toDoRepository.count() == 0){
            ToDo toDo = new ToDo();
            toDo.setCompleted(true);
            toDo.setText("Give dog a bath");
            toDoRepository.save(toDo);
            ToDo toDo2 = new ToDo();
            toDo2.setCompleted(false);
            toDo2.setText("Do laundry");
            toDoRepository.save(toDo2);

        }
    }
}
