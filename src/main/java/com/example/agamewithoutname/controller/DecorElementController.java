package com.example.agamewithoutname.controller;

import com.example.agamewithoutname.model.DecorElement;
import com.example.agamewithoutname.model.DefenseEquipment;
import com.example.agamewithoutname.repository.DecorElementRepository;
import com.example.agamewithoutname.repository.DefenseEquipmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class DecorElementController {

    private DecorElementRepository decorElementRepository;

    public DecorElementController(DecorElementRepository decorElementRepository) {
        this.decorElementRepository = decorElementRepository;
    }

    @GetMapping
    public List<DecorElement> GetAllDefenseEquipment() {
        return decorElementRepository.findAll();
    }


    @PostMapping
    public void createDefenseEquipment(@RequestBody DecorElement decorElementToCreate) {
        decorElementRepository.save(decorElementToCreate);
    }




//    @DeleteMapping
//    public void delete(@PathVariable("identifiant") Long id){
//        decorElementRepository.deleteById(id);
//        System.out.println("Suppression de l'entité avec l'id :" +id);
//    }
}
