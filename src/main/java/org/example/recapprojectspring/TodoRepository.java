package org.example.recapprojectspring;

import org.springframework.data.mongodb.repository.MongoRepository;

/*MongoRepository is a Spring data interface used to provide CRUD operations for MongoDB
 * <Todo, String>: The first parameter 'Todo' specifies the type of entity managed by the repository .i.e Todo objects.
 * The second parameter in the generics 'String' specifies the type of the ID field used in the Todo class.
 * Here it will be an ID field of type String*/

public interface TodoRepository extends MongoRepository<Todo, String> {
}
