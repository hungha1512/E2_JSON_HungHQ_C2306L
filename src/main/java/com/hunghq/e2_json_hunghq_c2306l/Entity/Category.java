package com.hunghq.e2_json_hunghq_c2306l.Entity;

public class Category {
    private int id;
    private String code;
    private String name;
    private String description;

    public Category() {
        ;
    }

    public Category(String code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(String code) {
        this.code = code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
