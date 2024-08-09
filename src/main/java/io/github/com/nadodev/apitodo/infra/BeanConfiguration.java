package io.github.com.nadodev.apitodo.infra;

import io.github.com.nadodev.apitodo.domain.ports.TodoRepositoryPort;
import io.github.com.nadodev.apitodo.domain.ports.TodoServicePort;
import io.github.com.nadodev.apitodo.domain.services.TodoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;

@Configuration
public class BeanConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public TodoServicePort todoServiceImpl(TodoRepositoryPort todoARepositoryPort) {
        return new TodoService(todoARepositoryPort);
    }
}