package com.example.NBA.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    int idmatch ;
    String stade ;
    int idequipe1 ;
    int idequipe2 ;
    public int getIdmatch() {
        return idmatch;
    }
    public void setIdmatch(int idmatch) {
        this.idmatch = idmatch;
    }
    public String getStade() {
        return stade;
    }
    public void setStade(String stade) {
        this.stade = stade;
    }
    public int getIdequipe1() {
        return idequipe1;
    }
    public void setIdequipe1(int idequipe1) {
        this.idequipe1 = idequipe1;
    }
    public int getIdequipe2() {
        return idequipe2;
    }
    public void setIdequipe2(int idequipe2) {
        this.idequipe2 = idequipe2;
    }
    public Match(int idmatch, String stade, int idequipe1, int idequipe2) {
        this.idmatch = idmatch;
        this.stade = stade;
        this.idequipe1 = idequipe1;
        this.idequipe2 = idequipe2;
    }
    public Match(){}
}
