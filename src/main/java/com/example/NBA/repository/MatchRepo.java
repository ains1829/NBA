package com.example.NBA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NBA.models.Match;

public interface MatchRepo extends JpaRepository<Match , Integer> {}
