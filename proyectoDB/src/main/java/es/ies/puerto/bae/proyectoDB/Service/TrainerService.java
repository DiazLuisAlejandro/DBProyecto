package es.ies.puerto.bae.proyectoDB.Service;

import es.ies.puerto.bae.proyectoDB.Dto.TrainerDto;
import es.ies.puerto.bae.proyectoDB.mappers.IMapperTrainer;
import es.ies.puerto.bae.proyectoDB.model.Dao.ITrainerDao;
import es.ies.puerto.bae.proyectoDB.model.entity.Trainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainerService implements IService<TrainerDto>{
    private final static Logger LOGGER = LoggerFactory.getLogger(TrainerService.class);

    private ITrainerDao iTrainerDao;

    @Autowired
    public void setPokemonDao(ITrainerDao iTrainerDao) {
        this.iTrainerDao = iTrainerDao;
    }


    @Override
    public void addToCollection(TrainerDto trainerDto) {
        iTrainerDao.insert(IMapperTrainer.INSTANCE.trainerDtoToTrainer(trainerDto));
    }



    @Override
    public void updateCollection(TrainerDto trainerDto) {
        Trainer  trainer = iTrainerDao.findById(trainerDto.getId()).orElseThrow(
                () -> new RuntimeException("Cannot find by ID"));

        trainer = IMapperTrainer.INSTANCE.trainerDtoToTrainer(trainerDto);

        iTrainerDao.save(trainer);
    }

    @Override
    public List<TrainerDto> getAllFromCollection() {
        List<Trainer> trainers = iTrainerDao.findAll();
        List<TrainerDto> trainerDtoList = new ArrayList<>();
        for (Trainer trainer : trainers) {
            trainerDtoList.add(IMapperTrainer.INSTANCE.trainerToTrainerDto(trainer));
        }
        return trainerDtoList;
    }

    @Override
    public TrainerDto getByIdFromCollection(int id) {
        Trainer trainer = iTrainerDao.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find by ID"));
        return IMapperTrainer.INSTANCE.trainerToTrainerDto(trainer);
    }

    @Override
    public void deleteFromCollection(int id) {
        Trainer trainer = iTrainerDao.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find by ID"));
        iTrainerDao.delete(trainer);
    }
}
