package com.example.agamewithoutname.repository;

import com.example.agamewithoutname.model.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnemyRepository extends JpaRepository<Enemy, Integer> {
}
