package es.ies.puerto.bae.proyectoDB.Controller;

import es.ies.puerto.bae.proyectoDB.Dto.PokemonDto;
import es.ies.puerto.bae.proyectoDB.Service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController implements IController<PokemonDto> {

    private PokemonService pokemonService;

    public PokemonController() {
    }

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @Autowired
    public void setPokemonService(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity add(@RequestBody PokemonDto pokemonDto) {
        pokemonService.addToCollection(pokemonDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @Override
    @PutMapping("/")
    public ResponseEntity update(@RequestBody PokemonDto pokemonDto) {
        pokemonService.updateCollection(pokemonDto);
        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/")
    public ResponseEntity<List<PokemonDto>> getAll() {
        return ResponseEntity.ok(pokemonService.getAllFromCollection());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<PokemonDto> getById(@PathVariable int id) {
        return ResponseEntity.ok(pokemonService.getByIdFromCollection(id));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        pokemonService.deleteFromCollection(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}