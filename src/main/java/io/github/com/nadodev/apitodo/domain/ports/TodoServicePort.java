package io.github.com.nadodev.apitodo.domain.ports;

import io.github.com.nadodev.apitodo.domain.Todo;

import java.util.List;

public interface TodoServicePort {

    Todo saveTodo(Todo todo);

    List<Todo> findAllTodo();

}
