package com.riotgamesapi.dto.summoner;

/**
 * @version 1.4
 */
public class Summoner {

    private long id;
    private String name;
    private int profileIconId;
    private long revisionDate;
    private long summonerLevel;

    /**
     *
     * @return Summoner ID.
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @return Summoner name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return ID of the summoner icon associated with the summoner.
     */
    public int getProfileIconId() {
        return profileIconId;
    }

    /**
     *
     * @return Date summoner was last modified specified as epoch milliseconds.
     */
    public long getRevisionDate() {
        return revisionDate;
    }

    /**
     *
     * @return Summoner level associated with the summoner.
     */
    public long getSummonerLevel() {
        return summonerLevel;
    }
}
