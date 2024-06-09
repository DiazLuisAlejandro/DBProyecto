package es.ies.puerto.bae.proyectoDB.Mappers;

import es.ies.puerto.bae.proyectoDB.Dto.ObjectPDto;
import es.ies.puerto.bae.proyectoDB.Dto.PokemonDto;
import es.ies.puerto.bae.proyectoDB.Dto.TrainerDto;
import es.ies.puerto.bae.proyectoDB.UtilitiesTest.Failures;
import es.ies.puerto.bae.proyectoDB.enumerate.Category;
import es.ies.puerto.bae.proyectoDB.enumerate.Role;
import es.ies.puerto.bae.proyectoDB.enumerate.Type;
import es.ies.puerto.bae.proyectoDB.model.entity.ObjectP;
import es.ies.puerto.bae.proyectoDB.model.entity.Pokemon;
import es.ies.puerto.bae.proyectoDB.model.entity.Trainer;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class MapperHelp extends Failures {

    public final int ID=100;
    public final String NAME="nameTest";
    public final String DESCRIPTION="itemTest";
    public final Category CATEGORY= Category.Evolution;
    public final List<Type> TYPES= List.of(new Type[]{Type.Water});
    public final Role ROLE=Role.Regular;

    public ObjectP objectP;
    public ObjectPDto objectPDto;
    public Trainer trainer;
    public TrainerDto trainerDto;
    public Pokemon pokemon;
    public PokemonDto pokemonDto;


    @BeforeEach
    public void beforeEach(){


        objectP=new ObjectP();
        objectP.setId(ID);
        objectP.setCategory(CATEGORY);
        objectP.setDescription(DESCRIPTION);
        objectP.setName(NAME);


        objectPDto=new ObjectPDto();
        objectPDto.setId(ID);
        objectPDto.setCategory(CATEGORY);
        objectPDto.setDescription(DESCRIPTION);
        objectPDto.setName(NAME);


        trainer=new Trainer();
        trainer.setId(ID);
        trainer.setRole(ROLE);
        trainer.setName(NAME);


        trainerDto=new TrainerDto();
        trainerDto.setId(ID);
        trainerDto.setRole(ROLE);
        trainerDto.setName(NAME);


        pokemon=new Pokemon();
        pokemon.setId(ID);
        pokemon.setName(NAME);
        pokemon.setTypes(TYPES);


        pokemonDto=new PokemonDto();
        pokemonDto.setId(ID);
        pokemonDto.setName(NAME);
        pokemonDto.setTypes(TYPES);
    }



}
