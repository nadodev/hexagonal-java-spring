package io.github.com.nadodev.apitodo.adapter.controller;


import io.github.com.nadodev.apitodo.domain.Todo;
import io.github.com.nadodev.apitodo.domain.ports.TodoServicePort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todos")
@AllArgsConstructor
public class TodoController {

    private final TodoServicePort todoServicePort;
    @PostMapping
    private Todo create(@RequestBody Todo todo) {
        return todoServicePort.saveTodo(todo);
    }


    @GetMapping
    private List<Todo> findAll() {
        return todoServicePort.findAllTodo();
    }

}
