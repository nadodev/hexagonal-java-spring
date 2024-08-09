package io.github.com.nadodev.apitodo.domain.ports;

import io.github.com.nadodev.apitodo.domain.Todo;

import java.util.List;

public interface TodoRepositoryPort {
    Todo save(Todo todo);
    List<Todo> getAll();
}
