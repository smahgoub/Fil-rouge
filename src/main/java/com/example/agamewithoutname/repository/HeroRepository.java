package com.example.agamewithoutname.repository;

import com.example.agamewithoutname.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<Hero,Integer>
{
}
