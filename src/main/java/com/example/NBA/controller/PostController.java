package com.example.NBA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.NBA.models.Alldta;
import com.example.NBA.models.Equipe;
import com.example.NBA.models.Joueur;
import com.example.NBA.models.Stat;
import com.example.NBA.service.EquipeSer;
import com.example.NBA.service.JoueurSer;
import com.example.NBA.service.Scored;
import com.example.NBA.service.StatSer;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private EquipeSer equipeservice ;
    @Autowired
    private StatSer serviceStat ;
    @Autowired 
    private Scored resulat;
    @Autowired
    private JoueurSer serjoueur ;
    @GetMapping("/allequipe")
    public List<Equipe> getALL(){
        return equipeservice.getAll() ;
    }
    @GetMapping("/insert_rebond") 
    public Stat insertStat(@RequestParam("idmatch") int idmatch , @RequestParam("idequipe") int idequipe , @RequestParam("idjoueur") int idjoueur){
        return serviceStat.saving_rebond(idmatch, idequipe, idequipe) ; 
    }
    @GetMapping("/insert_passd") 
    public Stat insertpassd(@RequestParam("idmatch") int idmatch , @RequestParam("idequipe") int idequipe , @RequestParam("idjoueur") int idjoueur){
        return serviceStat.saving_passD(idmatch, idequipe, idequipe) ; 
    }
    @GetMapping("/insertpoins") 
    public Stat insertpoint(@RequestParam("idmatch") int idmatch , @RequestParam("idequipe") int idequipe , @RequestParam("idjoueur") int idjoueur){
        return serviceStat.saving_points(idmatch, idequipe, idequipe) ; 
    }
    @GetMapping("/inserthreepoint") 
    public Stat inserthree(@RequestParam("idmatch") int idmatch , @RequestParam("idequipe") int idequipe , @RequestParam("idjoueur") int idjoueur){
        return serviceStat.saving_three_points(idmatch, idequipe, idequipe) ; 
    }
    @GetMapping("/allStatistic")
    public List<Stat> getStat(){
        return serviceStat.getAllStat() ;
    }
    @GetMapping("/resultat")
    public List<Alldta> getResultatAll(){
        return resulat.alldta() ;
    }
    @GetMapping("/getjoueurnbyequipe")
    public List<Joueur> getJoueurByEquipe(@RequestParam("idequipe") int idequipe){
        return serjoueur.getJourByIdequipe(idequipe) ;
    }
}
