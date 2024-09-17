package org.example.recapprojectspring;

import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.Id;

//Todo record which corresponds to the todo collection in MongoDB
public record Todo(@Id String id, String description, Status status) {
}
