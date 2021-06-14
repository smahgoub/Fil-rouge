package com.example.agamewithoutname.repository;


import com.example.agamewithoutname.model.GameUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameUserRepository extends JpaRepository<GameUser,Integer>
{

}
