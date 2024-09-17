package org.example.recapprojectspring;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

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

/*The findById() method searches the repository for a Todo object with the given id
*Returns the id if found, or else it throws a NoSuchElementException with an appropriate message*/
    public Todo findById(String id){
        return todoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No Todo with the id " + id));
    }


//    Save method which saves a new Todo object
    public Todo save(Todo todo){
        return todoRepository.save(new Todo(todo.id(), todo.description(), todo.status()));
    }

    /*The updateTodo() method takes in a todo object as its parameter
    * If the todo object does not exist, it returns an exception with a message to the user
    * If the todo element exists, it updates the todo object by saving it to the repository*/

    public Todo updateTodo(String id, Todo todo){
        Todo updatedTodo = todoRepository.findById(id).orElseThrow(()-> new NoSuchElementException("No Todo with the id " + id));
        return todoRepository.save(new Todo(updatedTodo.id(), todo.description(), todo.status()));
    }

    public String deleteById(String id){
        todoRepository.deleteById(id);
        return "Todo deleted! " + id;
    }

}
