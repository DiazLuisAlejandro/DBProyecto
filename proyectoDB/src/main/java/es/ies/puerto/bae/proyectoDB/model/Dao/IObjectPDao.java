package es.ies.puerto.bae.proyectoDB.model.Dao;

import es.ies.puerto.bae.proyectoDB.model.entity.ObjectP;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IObjectPDao extends MongoRepository<ObjectP, Integer> {

}
