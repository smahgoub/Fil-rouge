package com.example.agamewithoutname.controller;

import com.example.agamewithoutname.model.Weapon;
import com.example.agamewithoutname.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/weapon")
public class WeaponController {

    @Autowired
    private WeaponRepository weaponRepository;

    // Sélection de toutes les armes
    @GetMapping
    public List<Weapon> getAllWeapon() {
        return weaponRepository.findAll();
    }

    // Création de nouvelles armes
    @PostMapping
    public void createWeapon(@RequestBody Weapon weaponToCreate) {
        weaponRepository.save(weaponToCreate);
    }

<<<<<<< HEAD
    // Création de nouvelles armes
    //@PutMapping
    //public saveWeapon(@RequestBody Weapon weaponToSave) {
      //  return weaponRepository.save(weaponToSave);
=======
    // Mise à jour de nouvelles armes
    @PutMapping
    public void updateWeapon(@RequestBody Weapon weaponToUpdate) {
        weaponRepository.save(weaponToUpdate);
>>>>>>> 2b81a0a8479c7a5b831b132b2038968fa3fc89fc
    }

//    // Supprimer une arme par son id
//    @DeleteMapping("/{id}")
//    public void deleteWeapon(@PathVariable Long id) {
//        weaponRepository.delete((id));
//    }


