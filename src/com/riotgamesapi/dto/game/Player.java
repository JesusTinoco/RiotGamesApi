package com.riotgamesapi.dto.game;

/**
 * @version 1.3
 */
public class Player {

    private int championId;
    private long summonerId;
    private int teamId;

    /**
     *
     * @return Champion id associated with player.
     */
    public int getChampionId() {
        return championId;
    }

    /**
     *
     * @return Summoner id associated with player.
     */
    public long getSummonerId() {
        return summonerId;
    }

    /**
     *
     * @return Team id associated with player.
     */
    public int getTeamId() {
        return teamId;
    }
}
