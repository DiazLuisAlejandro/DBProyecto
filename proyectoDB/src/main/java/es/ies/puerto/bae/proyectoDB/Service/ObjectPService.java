package es.ies.puerto.bae.proyectoDB.Service;

import es.ies.puerto.bae.proyectoDB.Dto.ObjectPDto;
import es.ies.puerto.bae.proyectoDB.mappers.IMapperObjectP;
import es.ies.puerto.bae.proyectoDB.model.Dao.IObjectPDao;
import es.ies.puerto.bae.proyectoDB.model.entity.ObjectP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObjectPService implements IService<ObjectPDto> {

    private final static Logger LOGGER = LoggerFactory.getLogger(ObjectPService.class);

    private IObjectPDao iObjectPDao;

    @Autowired
    public void setPokemonDao(IObjectPDao iObjectPDao) {
        this.iObjectPDao = iObjectPDao;
    }


    @Override
    public void addToCollection(ObjectPDto objectPDto) {
        iObjectPDao.insert(IMapperObjectP.INSTANCE.objectPDtoToObjectP(objectPDto));
    }



    @Override
    public void updateCollection(ObjectPDto objectPDto) {
        ObjectP objectP = iObjectPDao.findById(objectPDto.getId()).orElseThrow(
                () -> new RuntimeException("Cannot find by ID"));

        objectP = IMapperObjectP.INSTANCE.objectPDtoToObjectP(objectPDto);

        iObjectPDao.save(objectP);
    }

    @Override
    public List<ObjectPDto> getAllFromCollection() {
        List<ObjectP> objectPS = iObjectPDao.findAll();
        List<ObjectPDto> objectPDtosList = new ArrayList<>();
        for (ObjectP objectP : objectPS) {
            objectPDtosList.add(IMapperObjectP.INSTANCE.objectPToObjectPDto(objectP));
        }
        return objectPDtosList;
    }

    @Override
    public ObjectPDto getByIdFromCollection(int id) {
        ObjectP objectP = iObjectPDao.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find by ID"));
        return IMapperObjectP.INSTANCE.objectPToObjectPDto(objectP);
    }

    @Override
    public void deleteFromCollection(int id) {
        ObjectP objectP = iObjectPDao.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find by ID"));
        iObjectPDao.delete(objectP);
    }
}
