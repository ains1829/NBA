package com.example.NBA.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.NBA.models.Stat;
public interface StatRepo extends JpaRepository<Stat , Integer> {}
