package es.ies.puerto.bae.proyectoDB.Dto;

import es.ies.puerto.bae.proyectoDB.enumerate.Category;

public class ObjectPDto {

    private int id;
    private String name;
    private String description;
    private Category category;


    public ObjectPDto() {
    }

    public ObjectPDto(int id, String name, String description, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public ObjectPDto(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", category='" + getCategory() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ObjectPDto)) {
            return false;
        }
        ObjectPDto objectPDto = (ObjectPDto) o;
        return id == objectPDto.id;
    }

   
 

}
