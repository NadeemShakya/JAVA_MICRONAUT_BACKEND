package todo.app.todo.model;

import todo.app.constant.DatabaseSchema;

import javax.persistence.*;

@Entity(name = "todos")
@Table(schema = DatabaseSchema.TODO)
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @Column(name = "is_completed")
    private Boolean isCompleted;

    public Long getId() {
        return  id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getIsCompleted() {
        return  isCompleted;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}