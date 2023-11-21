package com.example.NBA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NBA.models.Match;
import com.example.NBA.models.Stat;
import com.example.NBA.repository.MatchRepo;

@Service
public class MatchSer {
    @Autowired 
    private MatchRepo match ;
    @Autowired
    private StatSer service_stat ;
    public List<Match> getAllMatch(){
        return match.findAll() ;
    }
    public int score(int idmatch , int idequipe){
        int total = 0 ;
        List<Stat> stat = service_stat.getStat_match_equipe(idmatch, idequipe) ;
        for (int i = 0; i < stat.size(); i++) {
           total += ((stat.get(i).getPoints()) + stat.get(i).getThreepoints()) ;
        } 
        System.out.println(total);
        return total ;
    }
}
