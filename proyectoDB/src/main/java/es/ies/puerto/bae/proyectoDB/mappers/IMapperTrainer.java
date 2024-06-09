package es.ies.puerto.bae.proyectoDB.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.bae.proyectoDB.Dto.TrainerDto;
import es.ies.puerto.bae.proyectoDB.model.entity.Trainer;

@Mapper
public interface IMapperTrainer {
    IMapperTrainer INSTANCE = Mappers.getMapper(IMapperTrainer.class);

    Trainer trainerDtoTrainer(TrainerDto trainerDto);

    TrainerDto trainerTrainerDto(Trainer trainer);
}
