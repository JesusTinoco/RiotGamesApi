package com.riotgamesapi.dto.match;

/**
 * @version 2.2
 */
public class Player {

    private String matchHistoryUri;
    private int profileIcon;
    private long summonerId;
    private String summonerName;

    /**
     *
     * @return Match history URI
     */
    public String getMatchHistoryUri() {
        return matchHistoryUri;
    }

    /**
     *
     * @return Profile icon ID
     */
    public int getProfileIcon() {
        return profileIcon;
    }

    /**
     *
     * @return Summoner ID
     */
    public long getSummonerId() {
        return summonerId;
    }

    /**
     *
     * @return Summoner name
     */
    public String getSummonerName() {
        return summonerName;
    }
}
