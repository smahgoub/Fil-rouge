package com.example.agamewithoutname.controller;

import com.example.agamewithoutname.model.Hero;
import com.example.agamewithoutname.repository.HeroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "*")
@RequestMapping("/api/admin/hero")
public class HeroController {

    private HeroRepository heroRepository;

    public HeroController(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;}

    //Get pour récupérer le liste des héros existants
    @GetMapping
    public List<Hero> getAllHero() {return heroRepository.findAll();}

    //PostMapping pour créer de nouveaux héros
    @PostMapping
    public void createHero(@RequestBody Hero heroToCreate) {
        heroRepository.save(heroToCreate);
    }

    //DeleteMapping pour supprimer un heros
    //@DeleteMapping("/id")
    //public void deleteHero(@PathVariable Integer id) {heroRepository.delete(id);}
}