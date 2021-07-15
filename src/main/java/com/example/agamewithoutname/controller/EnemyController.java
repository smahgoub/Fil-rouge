package com.example.agamewithoutname.controller;

import com.example.agamewithoutname.model.Enemy;

import com.example.agamewithoutname.repository.EnemyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/admin/enemy")
public class EnemyController {

    @Autowired
    private EnemyRepository enemyRepository;

     // Sélection de tous les ennemis
    @GetMapping
    public List<Enemy> getAllEnemy() {
       return enemyRepository.findAll();
    }

    // Création de nouveaux ennemis
    @PostMapping
    public void createEnemy(@RequestBody Enemy enemyToCreate) {
     enemyRepository.save(enemyToCreate);
}


    // Modification de nouveaux ennemis
    @PutMapping
    public void updateEnemy(@RequestBody Enemy enemyToUpdate) {
        enemyRepository.save(enemyToUpdate);
    }

    // Suppression de nouveaux enemis
    @DeleteMapping("{id}")
    public void deleteEnemy(@PathVariable Integer id) {
        enemyRepository.deleteById(id);
    }
}