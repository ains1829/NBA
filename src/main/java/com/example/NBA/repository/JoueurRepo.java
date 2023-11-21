package com.example.NBA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NBA.models.Joueur;

public interface JoueurRepo extends JpaRepository<Joueur , Integer> {}
