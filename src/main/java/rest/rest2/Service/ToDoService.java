package rest.rest2.Service;

import rest.rest2.Entity.ToDo;
import rest.rest2.Entity.ToDoDTO;

import java.util.List;

public interface ToDoService {
    List<ToDoDTO> getAllTodos();
}
