package rest.rest2.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @UuidGenerator
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private String address;

    public Contact() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
