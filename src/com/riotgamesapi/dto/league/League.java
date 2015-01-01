package com.riotgamesapi.dto.league;

import java.util.List;

/**
 * @version 2.5
 */
public class League {

    private List<LeagueEntry> entries;
    private String name;
    private String participantId;
    private String queue;
    private String tier;

    /**
     * @return The requested league entries.
     */
    public List<LeagueEntry> getEntries() {
        return entries;
    }

    /**
     * @return This name is an internal place-holder name only. Display and localization of names in the game client are handled client-side.
     */
    public String getName() {
        return name;
    }

    /**
     * @return Specifies the relevant participant that is a member of this league (i.e., a requested summoner ID, a requested team ID, or the ID of a team to which one of the requested summoners belongs). Only present when full league is requested so that participant's entry can be identified. Not present when individual entry is requested.
     */
    public String getParticipantId() {
        return participantId;
    }

    /**
     * @return The league's queue type. (legal values: RANKED_SOLO_5x5, RANKED_TEAM_3x3, RANKED_TEAM_5x5)
     */
    public String getQueue() {
        return queue;
    }

    /**
     * @return The league's tier. (legal values: CHALLENGER, MASTER, DIAMOND, PLATINUM, GOLD, SILVER, BRONZE)
     */
    public String getTier() {
        return tier;
    }
}
