package es.ies.puerto.bae.proyectoDB.Controller;

import es.ies.puerto.bae.proyectoDB.Dto.ObjectPDto;
import es.ies.puerto.bae.proyectoDB.Service.ObjectPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objectp")
public class ObjectPController implements IController<ObjectPDto>{

    private ObjectPService objectPService;

    public ObjectPController(){
    }

    public ObjectPController(ObjectPService objectPService){
        this.objectPService=objectPService;
    }

    @Autowired
    public void setObjectPService(ObjectPService objectPService){
        this.objectPService=objectPService;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity add(@RequestBody ObjectPDto objectPDto) {
        objectPService.addToCollection(objectPDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    @PutMapping("/")
    public ResponseEntity update(@RequestBody ObjectPDto objectPDto) {
        objectPService.addToCollection(objectPDto);
        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/")
    public ResponseEntity<List<ObjectPDto>> getAll() {
        return ResponseEntity.ok(objectPService.getAllFromCollection());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<ObjectPDto> getById(@RequestBody int id) {
        return ResponseEntity.ok(objectPService.getByIdFromCollection(id));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        objectPService.deleteFromCollection(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
