package rest.rest2.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.rest2.Entity.ToDo;
import rest.rest2.Entity.ToDoDTO;
import rest.rest2.Service.ToDoService;

import java.util.List;

@RestController
@RequestMapping("/java/api")
@CrossOrigin(origins = "http://localhost:5173")
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("todos")
    ResponseEntity<?> getAllTodos(){
        List<ToDoDTO> allTodos = toDoService.getAllTodos();
        System.out.println("todos");
        return ResponseEntity.ok(allTodos);
    }
}
