package es.ies.puerto.bae.proyectoDB.Mappers;

import es.ies.puerto.bae.proyectoDB.Dto.PokemonDto;
import es.ies.puerto.bae.proyectoDB.mappers.IMapperPokemon;
import es.ies.puerto.bae.proyectoDB.model.entity.Pokemon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IMapperPokemonTest extends MapperHelp{
    Pokemon pokemonMapper;
    PokemonDto pokemonDtoMapper;

    @Test
    public void EntitytoDto(){
        pokemonDtoMapper= IMapperPokemon.INSTANCE.pokemonToPokemonDto(pokemon);
        Assertions.assertEquals(pokemonDto.getId(),pokemonDtoMapper.getId());
        Assertions.assertEquals(pokemonDto.getName(),pokemonDtoMapper.getName());
        Assertions.assertEquals(pokemonDto.getTypes(),pokemonDtoMapper.getTypes());
    }
    @Test
    public void DtoToEntity(){
        pokemonMapper= IMapperPokemon.INSTANCE.pokemonDtoToPokemon(pokemonDto);
        Assertions.assertEquals(pokemon.getId(),pokemonMapper.getId());
        Assertions.assertEquals(pokemon.getName(),pokemonMapper.getName());
        Assertions.assertEquals(pokemon.getTypes(),pokemonMapper.getTypes());

    }

}