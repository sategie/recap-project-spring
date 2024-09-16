package org.example.recapprojectspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController// Grants RESTful abilities to the TodoController class
@RequestMapping("api/todo")// Base URL for the controller's endpoints

public class TodoController {
    private final TodoService todoService;

//    Constructor for Dependency Injection and Inversion of Control
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

@GetMapping()// Defines a GET endpoint which handles GET requests to the base URL

/*getToDos() method which calls the getAllTodos() method of the TodoService
* The method retrieves a list of the todos
* The list is then serialized by Spring and returned as JSON to the client*/
    public List<Todo> getToDos(){
        return todoService.getAllTodos();
}






}
