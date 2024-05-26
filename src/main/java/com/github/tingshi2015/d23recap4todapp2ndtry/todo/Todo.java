package com.github.tingshi2015.d23recap4todapp2ndtry.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("todos")
public record Todo(
        @Id
        String id
) {
}
