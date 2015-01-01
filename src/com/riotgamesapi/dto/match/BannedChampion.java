package com.riotgamesapi.dto.match;

/**
 * @version 2.2
 */
public class BannedChampion {

    private int championId;
    private int pickTurn;

    /**
     *
     * @return Banned champion ID
     */
    public int getChampionId() {
        return championId;
    }

    /**
     *
     * @return Turn during which the champion was banned
     */
    public int getPickTurn() {
        return pickTurn;
    }
}
