package com.example.NBA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.NBA.models.Joueur;
import com.example.NBA.repository.JoueurRepo;
@Service
public class JoueurSer {
    @Autowired
    JoueurRepo repo ;
    public List<Joueur> getAll(){
        return repo.findAll() ;
    }
    public List<Joueur> getJourByIdequipe(int idequipe){
        List<Joueur> joueru = new ArrayList<Joueur>() ;
        List<Joueur> all = getAll() ;
        for (int i = 0; i < all.size(); i++) {
            if(all.get(i).getIdequipe() == idequipe){
                joueru.add(all.get(i)) ;
            }
        }
        return joueru ;
    }
}
