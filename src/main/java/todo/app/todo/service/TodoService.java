package todo.app.todo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
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

    /**
     * Updates isCompleted field by id.
     *
     * @param todo
     * @return ObjectNode
     */
    public ObjectNode updateIsCompletedById(Todo todo) {
        todoRepository.updateById(todo.getId(), todo.getIsCompleted());

        ObjectNode response = new ObjectMapper().createObjectNode();
        response.put("id", todo.getId());

        return response;

    }

    /**
     * Deletes the todo item by its id.
     * @param id
     * @return ObjectNode
     */
    public ObjectNode delete(Long id) {
        todoRepository.deleteById(id);

        ObjectNode response = new ObjectMapper().createObjectNode();
        response.put("id", id);

        return response;
    }


}
