package todo.app.todo.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import todo.app.todo.model.Todo;
import todo.app.todo.service.TodoService;

import javax.inject.Inject;

@Controller("/api/todos")
public class TodoController {
    @Inject
    private TodoService todoService;

    /**
     * Add a new todo to the todo list.
     *
     * @param todo
     * @return HttpResponse
     */
    @Post("/")
    public HttpResponse add(@Body Todo todo) {
        return HttpResponse.ok(todoService.add(todo));

    }
}
