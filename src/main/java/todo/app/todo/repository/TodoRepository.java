package todo.app.todo.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import todo.app.todo.model.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
