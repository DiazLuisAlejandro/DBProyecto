package es.ies.puerto.bae.proyectoDB.Dto;

import java.util.Objects;

import es.ies.puerto.bae.proyectoDB.enumerate.Role;

public class TrainerDto {

    private int id;
    private String name;
    private Role role;


    public TrainerDto() {
    }

    public TrainerDto(int id) {
        this.id = id;
    }

    public TrainerDto(int id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
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

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", role='" + getRole() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TrainerDto)) {
            return false;
        }
        TrainerDto trainerDto = (TrainerDto) o;
        return id == trainerDto.id && Objects.equals(role, trainerDto.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role);
    }

}
