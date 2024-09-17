package org.example.recapprojectspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public List<Todo> getToDos() {
    return todoService.getAllTodos();

}

@GetMapping("/{id}")// Defines a GET endpoint which handles GET requests to the /{id} path

/*getTodoById method which calls the findById method in TodoService class
* @PathVariable annotation is used to bind the id URL path variable to the id parameter in the getTodoById method*/
    public Todo getTodoById(@PathVariable String id){
        return todoService.findById(id);
}






}
