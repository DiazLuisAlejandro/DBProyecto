package es.ies.puerto.bae.proyectoDB.Service;

import es.ies.puerto.bae.proyectoDB.Dto.PokemonDto;

import java.util.List;

public interface IService <T> {

    public void addToCollection(T t);

    public void updateCollection(T t);

    public List<T> getAllFromCollection();
        public T getByIdFromCollection(int id);
        public void deleteFromCollection(int id);
    }

