package es.ies.puerto.bae.proyectoDB.Mappers;

import es.ies.puerto.bae.proyectoDB.Dto.ObjectPDto;
import es.ies.puerto.bae.proyectoDB.mappers.IMapperObjectP;
import es.ies.puerto.bae.proyectoDB.model.entity.ObjectP;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IMapperObjectPTest extends MapperHelp{
    ObjectP objectPMapper;
    ObjectPDto objectPDtoMapper;

    @Test
    public void EntitytoDto(){
        objectPDtoMapper= IMapperObjectP.INSTANCE.objectPToObjectPDto(objectP);
        Assertions.assertEquals(objectPDto.getId(),objectPDtoMapper.getId());
        Assertions.assertEquals(objectPDto.getName(),objectPDtoMapper.getName());
        Assertions.assertEquals(objectPDto.getDescription(),objectPDtoMapper.getDescription());
        Assertions.assertEquals(objectPDto.getCategory(),objectPDtoMapper.getCategory());
    }
    @Test
    public void DtoToEntity(){
        objectPMapper= IMapperObjectP.INSTANCE.objectPDtoToObjectP(objectPDto);
        Assertions.assertEquals(objectP.getId(),objectPMapper.getId());
        Assertions.assertEquals(objectP.getName(),objectPMapper.getName());
        Assertions.assertEquals(objectP.getDescription(),objectPMapper.getDescription());
        Assertions.assertEquals(objectP.getCategory(),objectPMapper.getCategory());
    }

}
