package com.spring.mvc.model;

import java.util.UUID;

public class Topic {

    private UUID id;

    private String title;

    private String owner;

    private String description;

    public Topic() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", owner='" + owner + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
