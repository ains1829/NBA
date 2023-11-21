package com.example.NBA.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NBA.models.Alldta;
import com.example.NBA.models.Match;
@Service
public class Scored {
    @Autowired
    private MatchSer matchSer ;
    public List<Alldta> alldta(){
        List<Match> allmatch = matchSer.getAllMatch() ;
        List<Alldta> dt = new ArrayList<Alldta>() ;
        for (int i = 0; i < allmatch.size(); i++) {
            int score1 = matchSer.score(allmatch.get(i).getIdmatch(), allmatch.get(i).getIdequipe1()) ;
            int score2 = matchSer.score(allmatch.get(i).getIdmatch(), allmatch.get(i).getIdequipe2()) ;
            System.out.println("score1 = " + score1 + " score2 = " + score2);
            dt.add(new Alldta(allmatch.get(i).getIdmatch(), allmatch.get(i).getStade(), allmatch.get(i).getIdequipe1(), allmatch.get(i).getIdequipe2(), score1, score2)) ;
        }
        return dt ;
    }
}
