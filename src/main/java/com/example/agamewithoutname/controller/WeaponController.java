package com.example.agamewithoutname.controller;

import com.example.agamewithoutname.model.Weapon;
import com.example.agamewithoutname.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin (origins = "*")
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

    // Mise à jour de nouvelles armes
    @PutMapping
    public void updateWeapon(@RequestBody Weapon weaponToUpdate) {
        weaponRepository.save(weaponToUpdate);
    }

//    // Supprimer une arme par son id
//    @DeleteMapping("/{id}")
//    public void deleteWeapon(@PathVariable Long id) {
//        weaponRepository.delete((id));
//    }

}
