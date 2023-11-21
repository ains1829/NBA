package com.example.NBA.models;
public class Alldta extends Match {
    int score1 ;
    int score2;
    public int getScore1() {
        return score1;
    }
    public void setScore1(int score1) {
        this.score1 = score1;
    }
    public int getScore2() {
        return score2;
    }
    public void setScore2(int score2) {
        this.score2 = score2;
    }
    public Alldta(int idmatch, String stade, int idequipe1, int idequipe2, int score1, int score2) {
        super(idmatch, stade, idequipe1, idequipe2);
        this.score1 = score1;
        this.score2 = score2;
    }
    

}
