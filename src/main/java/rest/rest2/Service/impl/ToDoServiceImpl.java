package rest.rest2.Service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import rest.rest2.Entity.ToDo;
import rest.rest2.Entity.ToDoDTO;
import rest.rest2.Repository.ToDoRepository;
import rest.rest2.Service.ToDoService;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {

    private final ToDoRepository toDoRepository;
    private final ModelMapper modelMapper;

    public ToDoServiceImpl(ToDoRepository toDoRepository, ModelMapper modelMapper) {
        this.toDoRepository = toDoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ToDoDTO> getAllTodos() {
        List<ToDo> all = toDoRepository.findAll();
        List<ToDoDTO> allTodos = all.stream()
                .map(todo ->
                     modelMapper.map(todo , ToDoDTO.class))
                .toList();
        return allTodos;
    }
}
