package io.github.com.nadodev.apitodo.domain.services;

import io.github.com.nadodev.apitodo.domain.Todo;
import io.github.com.nadodev.apitodo.domain.ports.TodoRepositoryPort;
import io.github.com.nadodev.apitodo.domain.ports.TodoServicePort;

import java.util.List;

public class TodoService implements TodoServicePort {

    private final TodoRepositoryPort todoRepositoryPort;

    public TodoService(TodoRepositoryPort todoRepositoryPort) {
        this.todoRepositoryPort = todoRepositoryPort;
    }

    @Override
    public Todo saveTodo(Todo todo) {
        todoRepositoryPort.save(todo);
        return todo;
    }

    @Override
    public List<Todo> findAllTodo() {
        return todoRepositoryPort.getAll();
    }
}
