package com.lucianofranca.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucianofranca.dsmovie.entities.Score;
import com.lucianofranca.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
