package com.example.agamewithoutname.controller;

import com.example.agamewithoutname.model.Hero;
import com.example.agamewithoutname.repository.HeroRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // car on fait une API Rest
@CrossOrigin(origins = "*") // Permet à tout le monde de venir modifier l'API, car Angular et l'API ne tournent pas au même endroit
// Si on ne met pas Origin, mon Front-End ne communiquera pas avec l'API
@RequestMapping("/api/admin/hero")
public class HeroController {

    private HeroRepository heroRepository;

    public HeroController(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;}

    // Sélection de tous les héros
    @GetMapping
    public List<Hero> getAllHero() {return heroRepository.findAll();}

    // Création de nouveaux héros
    @PostMapping
    public void createHero(@RequestBody Hero heroToCreate) {
        heroRepository.save(heroToCreate);
    }

    // Modification de nouveaux héros
    @PutMapping
    public void updateHero(@RequestBody Hero heroToUpdate) {
        heroRepository.save(heroToUpdate);
    }

    // Suppression d'un nouveaux héros
    @DeleteMapping ("{id}")
    public void deleteHero(@PathVariable Integer id) {
        heroRepository.deleteById(id);
    }
}