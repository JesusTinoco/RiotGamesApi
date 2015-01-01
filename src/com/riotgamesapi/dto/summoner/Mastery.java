package com.riotgamesapi.dto.summoner;

/**
 * @version 1.4
 */
public class Mastery {

    private int id;
    private int rank;

    /**
     *
     * @return Mastery ID. For static information correlating to masteries, please refer to the LoL Static Data API.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return Mastery rank (i.e., the number of points put into this mastery).
     */
    public int getRank() {
        return rank;
    }
}
