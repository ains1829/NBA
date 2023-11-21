package com.example.NBA.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.example.NBA.models.Stat;
import com.example.NBA.repository.JoueurRepo;
import com.example.NBA.repository.StatRepo;
@Service
public class StatSer {
    @Autowired
    private StatRepo sp ;
    public List<Stat> getAllStat(){
        return sp.findAll() ;
    }
    public Stat saving_rebond(int idmatch , int idequipe , int idjoueur ){
        LocalDateTime now = LocalDateTime.now();
        Stat stats = new Stat(idmatch , idequipe , idjoueur , 0 ,0 ,0 , 1,now) ;
        return sp.save(stats) ;
    }
    public Stat saving_passD(int idmatch , int idequipe , int idjoueur ){
        LocalDateTime now = LocalDateTime.now();
        Stat stats = new Stat(idmatch , idequipe , idjoueur , 0 ,1 ,0 , 0,now) ;
        return sp.save(stats) ;
    }
    public Stat saving_points(int idmatch , int idequipe , int idjoueur ){
        LocalDateTime now = LocalDateTime.now();
        Stat stats = new Stat(idmatch , idequipe , idjoueur , 1 ,0 ,0 , 0,now) ;
        return sp.save(stats) ;
    }
    public Stat saving_three_points(int idmatch , int idequipe , int idjoueur ){
        LocalDateTime now = LocalDateTime.now();
        Stat stats = new Stat(idmatch , idequipe , idjoueur , 0 ,0 ,3 , 0,now) ;
        return sp.save(stats) ;
    }
    public List<Stat> getStat_match_equipe(int idmatch , int idequipe1){
        List<Stat> stat = new ArrayList<Stat>() ;
        List<Stat> all = getAllStat() ;
        for (int i = 0; i < all.size(); i++) {
            if((all.get(i).getIdmatch() == idmatch) && (all.get(i).getIdequipe() == idequipe1)){
                stat.add(all.get(i)) ;
            }
        }
        return stat ;
    }
}
