package org.example.recapprojectspring;

//Todo record which corresponds to the todo collection in MongoDB
public record Todo(String id, String description, Status status) {
}
