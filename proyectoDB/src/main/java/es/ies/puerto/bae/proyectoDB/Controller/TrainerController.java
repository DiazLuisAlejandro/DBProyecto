package es.ies.puerto.bae.proyectoDB.Controller;

import es.ies.puerto.bae.proyectoDB.Dto.TrainerDto;
import es.ies.puerto.bae.proyectoDB.Service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController implements IController<TrainerDto>{

    private TrainerService trainerService;

    public TrainerController() {
    }

    public TrainerController(TrainerService trainerService){
        this.trainerService=trainerService;
    }

    @Autowired
    public void setTrainerService(TrainerService trainerService){
        this.trainerService=trainerService;
    }
    @Override
    @PostMapping("/")
    public ResponseEntity add(@RequestBody TrainerDto trainerDto) {
        trainerService.addToCollection(trainerDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    @PutMapping("/")
    public ResponseEntity update(@RequestBody TrainerDto trainerDto) {
        trainerService.updateCollection(trainerDto);
    return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/")
    public ResponseEntity<List<TrainerDto>> getAll() {
        return ResponseEntity.ok(trainerService.getAllFromCollection());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<TrainerDto> getById(@PathVariable int id) {
        return ResponseEntity.ok(trainerService.getByIdFromCollection(id));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        trainerService.deleteFromCollection(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
