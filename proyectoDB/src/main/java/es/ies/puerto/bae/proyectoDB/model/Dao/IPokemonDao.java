package es.ies.puerto.bae.proyectoDB.model.Dao;

import es.ies.puerto.bae.proyectoDB.model.entity.Pokemon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPokemonDao extends MongoRepository<Pokemon, Integer> {


}
