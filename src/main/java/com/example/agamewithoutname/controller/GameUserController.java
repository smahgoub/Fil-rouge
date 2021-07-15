package com.example.agamewithoutname.controller;

import com.example.agamewithoutname.model.Enemy;
import com.example.agamewithoutname.model.GameUser;
import com.example.agamewithoutname.repository.GameUserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/admin/gameuser")
public class gitGameUserController {

    private GameUserRepository gameUserRepository;

    public GameUserController(GameUserRepository gameUserRepository) {
        this.gameUserRepository = gameUserRepository;}

    //Get pour récupérer le liste des users existants
    @GetMapping
    public List<GameUser> getAllUser() {return gameUserRepository.findAll();}

    //PostMapping pour créer de nouveaux users
    @PostMapping
    public void createGameUser(@RequestBody GameUser gameUserToCreate) {
        gameUserRepository.save(gameUserToCreate);
    }


    // Modification de nouveaux users
    @PutMapping
    public void updateGameUser(@RequestBody GameUser gameUserToUpdate) {
        gameUserRepository.save(gameUserToUpdate);
    }

    // Suppression de nouveaux users
    @DeleteMapping("{id}")
    public void deleteEnemy(@PathVariable Integer id) {
        gameUserRepository.deleteById(id);
    }



}
