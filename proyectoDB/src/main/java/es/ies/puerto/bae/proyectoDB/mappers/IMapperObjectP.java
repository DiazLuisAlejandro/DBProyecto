package es.ies.puerto.bae.proyectoDB.mappers;

import es.ies.puerto.bae.proyectoDB.model.entity.ObjectP;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.bae.proyectoDB.Dto.ObjectPDto;

@Mapper
public interface IMapperObjectP {

    IMapperObjectP INSTANCE = Mappers.getMapper(IMapperObjectP.class);

    ObjectP objectPDtoToObjectP(ObjectPDto objectPDto);

    ObjectPDto objectPToObjectPDto(ObjectP objectP);
}
