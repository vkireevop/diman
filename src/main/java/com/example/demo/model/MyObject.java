package com.example.demo.model;

public class MyObject {
    private String name;
    private String description;

    public MyObject(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public MyObject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}