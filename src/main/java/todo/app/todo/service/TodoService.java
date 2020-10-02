package todo.app.todo.service;

import todo.app.todo.model.Todo;
import todo.app.todo.repository.TodoRepository;

import javax.inject.Inject;

public class TodoService {
    @Inject
    private TodoRepository todoRepository;

    /**
     * Adds a new todo.
     *
     * @param todo
     * @return Todo
     */
    public Todo add(Todo todo) {
        return todoRepository.save(todo);
    }
}
