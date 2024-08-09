package io.github.com.nadodev.apitodo.adapter.repository;

import io.github.com.nadodev.apitodo.adapter.entities.TodoEntity;
import io.github.com.nadodev.apitodo.domain.Todo;
import io.github.com.nadodev.apitodo.domain.ports.TodoRepositoryPort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class TodoRepositoryAdapter implements TodoRepositoryPort {

    private final TodoRepository todoRepository;

    private final ModelMapper modelMapper;

    @Override
    public Todo save(Todo todo) {

        TodoEntity todoEntity = modelMapper.map(todo, TodoEntity.class);

        TodoEntity save = todoRepository.save(todoEntity);

        return modelMapper.map(save, Todo.class);
    }

    @Override
    public List<Todo> getAll() {
        List<TodoEntity> all = todoRepository.findAll();
        return all.stream()
                .map( todoEntity -> modelMapper.map(todoEntity, Todo.class))
                .collect(Collectors.toList());
    }
}
