package es.ies.puerto.bae.proyectoDB.mappers;

import es.ies.puerto.bae.proyectoDB.model.entity.Trainer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.bae.proyectoDB.Dto.TrainerDto;

@Mapper
public interface IMapperTrainer {
    IMapperTrainer INSTANCE = Mappers.getMapper(IMapperTrainer.class);

    Trainer trainerDtoToTrainer(TrainerDto trainerDto);

    TrainerDto trainerToTrainerDto(Trainer trainer);
}
