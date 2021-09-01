package com.example.agamewithoutname.controller;

import com.example.agamewithoutname.model.Weapon;
import com.example.agamewithoutname.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
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

    // Modification de nouvelles armes
    @PutMapping
    public void updateWeapon(@RequestBody Weapon weaponToUpdate) {
        weaponRepository.save(weaponToUpdate);
    }

    // Suppression d'arme (via son id)
    @DeleteMapping("{id}")
    public void deleteWeapon(@PathVariable Integer id) {
    weaponRepository.deleteById((id));
   }
}
