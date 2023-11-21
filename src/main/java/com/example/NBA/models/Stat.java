package com.example.NBA.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Stat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    int idstat ;
    int idmatch ;
    int idequipe ;
    int idjoueur ;
    int points ;
    int passd ;
    int threepoints ;
    int rebonds ;
    LocalDateTime datestat ;
    public int getIdstat() {
        return idstat;
    }
    public void setIdstat(int idstat) {
        this.idstat = idstat;
    }
    public int getIdmatch() {
        return idmatch;
    }
    public void setIdmatch(int idmatch) {
        this.idmatch = idmatch;
    }
    public int getIdequipe() {
        return idequipe;
    }
    public void setIdequipe(int idequipe) {
        this.idequipe = idequipe;
    }
    public int getIdjoueur() {
        return idjoueur;
    }
    public void setIdjoueur(int idjoueur) {
        this.idjoueur = idjoueur;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getPassd() {
        return passd;
    }
    public void setPassd(int passd) {
        this.passd = passd;
    }
    public int getThreepoints() {
        return threepoints;
    }
    public void setThreepoints(int threepoints) {
        this.threepoints = threepoints;
    }
    public int getRebonds() {
        return rebonds;
    }
    public void setRebonds(int rebonds) {
        this.rebonds = rebonds;
    }
    public LocalDateTime getDatestat() {
        return datestat;
    }
    public void setDatestat(LocalDateTime datestat) {
        this.datestat = datestat;
    }
    public Stat(int idstat, int idmatch, int idequipe, int idjoueur, int points, int passd, int threepoints,
            int rebonds, LocalDateTime datestat) {
        this.idstat = idstat;
        this.idmatch = idmatch;
        this.idequipe = idequipe;
        this.idjoueur = idjoueur;
        this.points = points;
        this.passd = passd;
        this.threepoints = threepoints;
        this.rebonds = rebonds;
        this.datestat = datestat;
    }
    public Stat(){}
     public Stat(int idmatch, int idequipe, int idjoueur, int points, int passd, int threepoints, int rebonds,
            LocalDateTime datestat) {
        this.idmatch = idmatch;
        this.idequipe = idequipe;
        this.idjoueur = idjoueur;
        this.points = points;
        this.passd = passd;
        this.threepoints = threepoints;
        this.rebonds = rebonds;
        this.datestat = datestat;
    }
}
