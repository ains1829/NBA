package com.example.NBA.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    int idjoueur ;
    String namejoueur ;
    String numerojoueur ;
    int idequipe ;
    public int getIdjoueur() {
        return idjoueur;
    }
    public void setIdjoueur(int idjoueur) {
        this.idjoueur = idjoueur;
    }
    public String getNamejoueur() {
        return namejoueur;
    }
    public void setNamejoueur(String namejoueur) {
        this.namejoueur = namejoueur;
    }
    public String getNumerojoueur() {
        return numerojoueur;
    }
    public void setNumerojoueur(String numerojoueur) {
        this.numerojoueur = numerojoueur;
    }
    public int getIdequipe() {
        return idequipe;
    }
    public void setIdequipe(int idequipe) {
        this.idequipe = idequipe;
    }
    public Joueur(int idjoueur, String namejoueur, String numerojoueur, int idequipe) {
        this.idjoueur = idjoueur;
        this.namejoueur = namejoueur;
        this.numerojoueur = numerojoueur;
        this.idequipe = idequipe;
    }
    public Joueur() {
    }
}
