package es.ies.puerto.bae.proyectoDB.Mappers;

import es.ies.puerto.bae.proyectoDB.Dto.TrainerDto;
import es.ies.puerto.bae.proyectoDB.mappers.IMapperTrainer;
import es.ies.puerto.bae.proyectoDB.model.entity.Trainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IMapperTrainerTest extends MapperHelp{
    Trainer trainerMapper;
    TrainerDto trainerDtoMapper;

    @Test
    public void EntitytoDto(){
        trainerDtoMapper= IMapperTrainer.INSTANCE.trainerToTrainerDto(trainer);
        Assertions.assertEquals(trainerDto.getId(),trainerDtoMapper.getId());
        Assertions.assertEquals(trainerDto.getName(),trainerDtoMapper.getName());
        Assertions.assertEquals(trainerDto.getRole(),trainerDtoMapper.getRole());
    }
    @Test
    public void DtoToEntity(){
        trainerMapper= IMapperTrainer.INSTANCE.trainerDtoToTrainer(trainerDto);
        Assertions.assertEquals(trainer.getId(),trainerMapper.getId());
        Assertions.assertEquals(trainer.getName(),trainerMapper.getName());
        Assertions.assertEquals(trainer.getRole(),trainerMapper.getRole());
    }

}