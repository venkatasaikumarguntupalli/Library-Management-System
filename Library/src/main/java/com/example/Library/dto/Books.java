package com.example.Library.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Books implements Serializable {

    public Long id;

    @NotBlank(message="field cannot be empty")
    private String name,writer,summary,category;

    public Books(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Books(Long id, @NotBlank(message = "field cannot be empty") String name, @NotBlank(message = "field cannot be empty") String writer, @NotBlank(message = "field cannot be empty") String summary, @NotBlank(message = "field cannot be empty") String category) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.summary = summary;
        this.category = category;
    }
}
