package rest.rest2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rest.rest2.Entity.ToDo;

import java.util.Optional;

public interface ToDoRepository extends JpaRepository<ToDo, String> {

}
