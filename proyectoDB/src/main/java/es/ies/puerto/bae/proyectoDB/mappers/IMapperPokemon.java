package es.ies.puerto.bae.proyectoDB.mappers;

import es.ies.puerto.bae.proyectoDB.model.entity.Pokemon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.bae.proyectoDB.Dto.PokemonDto;

@Mapper
public interface IMapperPokemon {
    IMapperPokemon INSTANCE = Mappers.getMapper(IMapperPokemon.class);

    Pokemon pokemonDtoToPokemon(PokemonDto pokemonDto);

    PokemonDto pokemonToPokemonDto(Pokemon pokemon);
}
