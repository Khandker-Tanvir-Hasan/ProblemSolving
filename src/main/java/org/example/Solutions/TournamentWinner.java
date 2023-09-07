package org.example.Solutions;
import java.util.*;
public class TournamentWinner {
    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap <String, Integer> scoreboard = new HashMap<>();
        int maxScore = 0;
        String maxScorerName = "";
        for(int i=0 ; i < results.size() ; i++){
            int currentMatchWinnerIndex = results.get(i)==1 ? 0:1;
            String currentMatchWinnerName = competitions.get(i).get(currentMatchWinnerIndex);
            int currentWinnerTotalScore = scoreboard.containsKey(currentMatchWinnerName) ? scoreboard.get(currentMatchWinnerName)+3 : 3;
            scoreboard.put(currentMatchWinnerName , currentWinnerTotalScore);
            if(scoreboard.get(currentMatchWinnerName) > maxScore ){
                maxScore = currentWinnerTotalScore;
                maxScorerName = currentMatchWinnerName;
            }
        }
        return maxScorerName;
    }
}
