package io.github.com.nadodev.apitodo.adapter.repository;

import io.github.com.nadodev.apitodo.adapter.entities.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository  extends JpaRepository<TodoEntity, Integer> {

}
