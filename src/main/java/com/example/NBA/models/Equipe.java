package com.example.NBA.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    int idequipe ;
    String name_equipe ;
    public int getIdequipe() {
        return idequipe;
    }
    public void setIdequipe(int idequipe) {
        this.idequipe = idequipe;
    }
    public String getName_equipe() {
        return name_equipe;
    }
    public void setName_equipe(String name_equipe) {
        this.name_equipe = name_equipe;
    }
    public Equipe(){}
    public Equipe(int idequipe, String name_equipe) {
        this.idequipe = idequipe;
        this.name_equipe = name_equipe;
    }
}
