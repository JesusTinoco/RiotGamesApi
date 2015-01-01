package com.riotgamesapi.dto.team;

/**
 * @version 2.4
 */
public class TeamStatDetail {

    private int averageGamesPlayed;
    private int losses;
    private String teamStatType;
    private int wins;

    public int getAverageGamesPlayed() {
        return averageGamesPlayed;
    }

    public int getLosses() {
        return losses;
    }

    public String getTeamStatType() {
        return teamStatType;
    }

    public int getWins() {
        return wins;
    }
}
