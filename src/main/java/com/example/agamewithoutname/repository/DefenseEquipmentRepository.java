package com.example.agamewithoutname.repository;

import com.example.agamewithoutname.model.DefenseEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefenseEquipmentRepository extends JpaRepository<DefenseEquipment, Integer> {
}
