package com.example.NBA.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NBA.models.Equipe;
import com.example.NBA.repository.EquipeRepo;

@Service
public class EquipeSer {
    @Autowired
    private EquipeRepo equiperepo ;
    public Equipe saving_rebond (Equipe equipe) {
        return equiperepo.save(equipe) ;
    }
    public List<Equipe> getAll(){
        return equiperepo.findAll();
    }
}
