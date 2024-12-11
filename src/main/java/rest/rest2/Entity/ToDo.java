package rest.rest2.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "todo")
public class ToDo {
    @Id
    @UuidGenerator
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String _id;

    @Column(name = "text")
    private String text;

    @Column(name = "isCompleted")
    private boolean isCompleted;

    public ToDo() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }
}
