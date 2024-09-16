package org.example.recapprojectspring;

import org.springframework.stereotype.Service;

import java.util.List;

@Service// Spring annotation to make Spring know that this is a Service
public class TodoService {
    private final TodoRepository todoRepository;

//    Constructor for Dependency Injection and Inversion of Control
    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

//    Method which finds all the Todos and saves them in a list
    public List<Todo> getAllTodos(){
       return todoRepository.findAll();
    }


}
