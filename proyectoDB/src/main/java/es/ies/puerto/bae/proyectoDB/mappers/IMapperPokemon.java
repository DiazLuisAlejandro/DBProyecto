package es.ies.puerto.bae.proyectoDB.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.bae.proyectoDB.Dto.PokemonDto;
import es.ies.puerto.bae.proyectoDB.model.entity.Pokemon;

@Mapper
public interface IMapperPokemon {
    IMapperPokemon INSTANCE = Mappers.getMapper(IMapperPokemon.class);

    Pokemon pokemonDtoToPokemon(PokemonDto pokemonDto);

    PokemonDto pokemonToPokemonDto(Pokemon pokemon);
}
