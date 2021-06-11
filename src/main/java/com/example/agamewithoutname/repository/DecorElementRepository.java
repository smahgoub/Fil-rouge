package com.example.agamewithoutname.repository;

import com.example.agamewithoutname.model.DecorElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecorElementRepository extends JpaRepository<DecorElement, Integer> {

}
