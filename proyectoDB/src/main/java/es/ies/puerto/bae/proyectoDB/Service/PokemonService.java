package es.ies.puerto.bae.proyectoDB.Service;

import es.ies.puerto.bae.proyectoDB.Dto.PokemonDto;
import es.ies.puerto.bae.proyectoDB.mappers.IMapperPokemon;
import es.ies.puerto.bae.proyectoDB.model.Dao.IPokemonDao;
import es.ies.puerto.bae.proyectoDB.model.entity.Pokemon;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PokemonService implements IService<PokemonDto> {

    private final static Logger LOGGER = LoggerFactory.getLogger(PokemonService.class);

    private IPokemonDao iPokemonDao;

    @Autowired
    public void setPokemonDao(IPokemonDao iPokemonDao) {
        this.iPokemonDao = iPokemonDao;
    }


    @Override
    public void addToCollection(PokemonDto pokemonDto) {
        iPokemonDao.insert(IMapperPokemon.INSTANCE.pokemonDtoToPokemon(pokemonDto));
    }



    @Override
    public void updateCollection(PokemonDto pokemonDto) {
        Pokemon pokemon = iPokemonDao.findById(pokemonDto.getId()).orElseThrow(
                () -> new RuntimeException("Cannot find by ID"));

        pokemon = IMapperPokemon.INSTANCE.pokemonDtoToPokemon(pokemonDto);

        iPokemonDao.save(pokemon);
    }

    @Override
    public List<PokemonDto> getAllFromCollection() {
        List<Pokemon> pokemons = iPokemonDao.findAll();
        List<PokemonDto> pokemonDtoList = new ArrayList<>();
        for (Pokemon pokemon : pokemons) {
            pokemonDtoList.add(IMapperPokemon.INSTANCE.pokemonToPokemonDto(pokemon));
        }
        return pokemonDtoList;
    }

    @Override
    public PokemonDto getByIdFromCollection(int id) {
        Pokemon pokemon = iPokemonDao.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find by ID"));
        return IMapperPokemon.INSTANCE.pokemonToPokemonDto(pokemon);
    }

    @Override
    public void deleteFromCollection(int id) {
        Pokemon pokemon = iPokemonDao.findById(id).orElseThrow(
                () -> new RuntimeException("Cannot find by ID"));
        iPokemonDao.delete(pokemon);
    }
}