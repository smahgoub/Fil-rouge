package com.example.agamewithoutname.controller;

import com.example.agamewithoutname.model.GameUser;
import com.example.agamewithoutname.repository.GameUserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/gameuser")
public class GameUserController {

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

    //DeleteMapping pour supprimer un user
    //@DeleteMapping("/id")
    //public void deleteGameUser(@PathVariable Integer id) {gameUserRepository.delete(id);}
}
