package com.example.agamewithoutname.controller;
import com.example.agamewithoutname.model.DecorElement;
import com.example.agamewithoutname.repository.DecorElementRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin (origins = "*")
@RequestMapping("/api/admin/decorelement")
public class DecorElementController {

    private DecorElementRepository decorElementRepository;

    public DecorElementController(DecorElementRepository decorElementRepository) {
        this.decorElementRepository = decorElementRepository;
    }

    @GetMapping
    public List<DecorElement> GetAllDecorElement() {
        return decorElementRepository.findAll();
    }

    @PostMapping
    public void createDecorElement(@RequestBody DecorElement decorElementToCreate) {
        decorElementRepository.save(decorElementToCreate);
    }

    @PutMapping
    public void updateDecorElement(@RequestBody DecorElement decorElementToUpdate) {
        decorElementRepository.save(decorElementToUpdate);
    }

    @DeleteMapping("{id}")
    public void deleteDecorElement(@PathVariable Integer id) {
    decorElementRepository.deleteById(id);
    }
}
