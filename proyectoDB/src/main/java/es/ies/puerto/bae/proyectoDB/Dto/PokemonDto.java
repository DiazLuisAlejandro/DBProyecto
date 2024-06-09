package es.ies.puerto.bae.proyectoDB.Dto;

import java.util.List;

import es.ies.puerto.bae.proyectoDB.enumerate.Type;

public class PokemonDto {
    
    private int id;
    private List<Type> types;
    private String name;


    public PokemonDto() {
    }

    public PokemonDto(int id, List<Type> types, String name) {
        this.id = id;
        this.types = types;
        this.name = name;
    }

    public PokemonDto(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Type> getTypes() {
        return this.types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PokemonDto)) {
            return false;
        }
        PokemonDto pokemonDto = (PokemonDto) o;
        return id == pokemonDto.id;
    }

   

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", types='" + getTypes() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

}
