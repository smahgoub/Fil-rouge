package com.example.agamewithoutname.controller;

import com.example.agamewithoutname.model.DefenseEquipment;
import com.example.agamewithoutname.repository.DefenseEquipmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/admin/defenseequipment")
public class DefenseEquipmentController {

    private DefenseEquipmentRepository defenseEquipmentRepository;

    public DefenseEquipmentController(DefenseEquipmentRepository defenseEquipmentRepository) {
        this.defenseEquipmentRepository = defenseEquipmentRepository;
    }

    // Sélection de tous les équipements défensifs
    @GetMapping
    public List<DefenseEquipment>GetAllDefenseEquipment() {
        return defenseEquipmentRepository.findAll();
    }

    // Création de nouveaux équipements défensifs
    @PostMapping
    public void createDefenseEquipment(@RequestBody  DefenseEquipment defenseEquipmentToCreate) {
        defenseEquipmentRepository.save(defenseEquipmentToCreate);
    }

// Suppression des éléments du décor
//    @DeleteMapping
//    public void delete(@PathVariable("identifiant") Long id){
//        defenseEquipmentRepository.deleteById(id);
//        System.out.println("Suppression de l'entité avec l'id :" +id);
//    }



}
