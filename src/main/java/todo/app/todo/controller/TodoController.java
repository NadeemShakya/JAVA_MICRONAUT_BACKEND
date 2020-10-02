package todo.app.todo.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Patch;
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

    /**
     * Toggles whether the todo is complete or incomplete.
     *
     * @param todo
     * @return HttpResponse
     */
    @Patch("/")
    public HttpResponse updateIsCompletedById(@Body Todo todo) {
        return HttpResponse.ok(todoService.updateIsCompletedById(todo));
    }
}