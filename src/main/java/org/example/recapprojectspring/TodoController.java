package org.example.recapprojectspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// Grants RESTful abilities to the TodoController class
@RequestMapping("api/todo")// Base URL for the controller's endpoints

public class TodoController {
    private final TodoService todoService;

//    Constructor for Dependency Injection and Inversion of Control
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }








}
