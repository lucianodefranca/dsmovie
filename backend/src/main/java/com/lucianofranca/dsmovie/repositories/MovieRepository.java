package com.lucianofranca.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucianofranca.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
