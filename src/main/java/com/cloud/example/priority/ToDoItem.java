package com.cloud.example.priority;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ToDoItem {
    @Id
    private String id;
    private String title;
    private String description;

    public ToDoItem(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoItem toDoItem = (ToDoItem) o;
        return Objects.equals(id, toDoItem.id) && Objects.equals(title, toDoItem.title) && Objects.equals(description, toDoItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description);
    }
}
