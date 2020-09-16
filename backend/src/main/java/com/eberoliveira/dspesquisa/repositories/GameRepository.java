package com.eberoliveira.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eberoliveira.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
