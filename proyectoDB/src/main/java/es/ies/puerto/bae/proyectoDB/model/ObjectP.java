package es.ies.puerto.bae.proyectoDB.model;

import es.ies.puerto.bae.proyectoDB.enumerate.Category;

import java.util.Objects;


public class ObjectP {

    private int id;
    private String name;
    private String description;
    private Category category;

    public ObjectP() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectP objectP = (ObjectP) o;
        return id == objectP.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
