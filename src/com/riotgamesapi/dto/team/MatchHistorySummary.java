package com.riotgamesapi.dto.team;

/**
 * @version 2.4
 */
public class MatchHistorySummary {

    private int assists;
    private long date;
    private int deaths;
    private long gameId;
    private String gameMode;
    private boolean invalid;
    private int kills;
    private int mapId;
    private int opposingTeamKills;
    private String opposingTeamName;
    private boolean win;

    public int getAssists() {
        return assists;
    }

    /**
     *
     * @return Date that match was completed specified as epoch milliseconds.
     */
    public long getDate() {
        return date;
    }

    public int getDeaths() {
        return deaths;
    }

    public long getGameId() {
        return gameId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public int getKills() {
        return kills;
    }

    public int getMapId() {
        return mapId;
    }

    public int getOpposingTeamKills() {
        return opposingTeamKills;
    }

    public String getOpposingTeamName() {
        return opposingTeamName;
    }

    public boolean isWin() {
        return win;
    }
}
