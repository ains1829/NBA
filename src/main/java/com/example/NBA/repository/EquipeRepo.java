package com.example.NBA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NBA.models.Equipe;

public interface EquipeRepo extends JpaRepository<Equipe , Integer> {}
