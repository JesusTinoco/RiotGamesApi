package com.riotgamesapi.dto.match;

import java.util.List;

/**
 * @version 2.2
 */
public class MatchDetail {

    private int mapId;
    private long matchCreation;
    private long matchDuration;
    private long matchId;
    private String matchMode;
    private String matchType;
    private String matchVersion;
    private List<ParticipantIdentity> participantIdentities;
    private List<Participant> participants;
    private String platformId;
    private String queueType;
    private String region;
    private String season;
    private List<Team> teams;
    private Timeline timeline;

    /**
     * @return Match map ID
     */
    public int getMapId() {
        return mapId;
    }

    /**
     *
     * @return Match creation time. Designates when the team select lobby is created and/or the match is made through match making, not when the game actually starts.
     */
    public long getMatchCreation() {
        return matchCreation;
    }

    /**
     *
     * @return Match duration
     */
    public long getMatchDuration() {
        return matchDuration;
    }

    /**
     *
     * @return ID of the match
     */
    public long getMatchId() {
        return matchId;
    }

    /**
     *
     * @return Match mode (legal values: CLASSIC, ODIN, ARAM, TUTORIAL, ONEFORALL, ASCENSION, FIRSTBLOOD, KINGPORO)
     */
    public String getMatchMode() {
        return matchMode;
    }

    /**
     *
     * @return Match type (legal values: CUSTOM_GAME, MATCHED_GAME, TUTORIAL_GAME)
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     *
     * @return Match version
     */
    public String getMatchVersion() {
        return matchVersion;
    }

    /**
     *
     * @return Participant identity information
     */
    public List<ParticipantIdentity> getParticipantIdentities() {
        return participantIdentities;
    }

    /**
     *
     * @return Participant information
     */
    public List<Participant> getParticipants() {
        return participants;
    }

    /**
     *
     * @return Platform ID of the match
     */
    public String getPlatformId() {
        return platformId;
    }

    /**
     *
     * @return Match queue type (legal values: CUSTOM, NORMAL_5x5_BLIND, RANKED_SOLO_5x5, RANKED_PREMADE_5x5, BOT_5x5, NORMAL_3x3, RANKED_PREMADE_3x3, NORMAL_5x5_DRAFT, ODIN_5x5_BLIND, ODIN_5x5_DRAFT, BOT_ODIN_5x5, BOT_5x5_INTRO, BOT_5x5_BEGINNER, BOT_5x5_INTERMEDIATE, RANKED_TEAM_3x3, RANKED_TEAM_5x5, BOT_TT_3x3, GROUP_FINDER_5x5, ARAM_5x5, ONEFORALL_5x5, FIRSTBLOOD_1x1, FIRSTBLOOD_2x2, SR_6x6, URF_5x5, BOT_URF_5x5, NIGHTMARE_BOT_5x5_RANK1, NIGHTMARE_BOT_5x5_RANK2, NIGHTMARE_BOT_5x5_RANK5, ASCENSION_5x5, HEXAKILL, KING_PORO_5x5)
     */
    public String getQueueType() {
        return queueType;
    }

    /**
     *
     * @return Region where the match was played
     */
    public String getRegion() {
        return region;
    }

    /**
     *
     * @return Season match was played (legal values: PRESEASON3, SEASON3, PRESEASON2014, SEASON2014)
     */
    public String getSeason() {
        return season;
    }

    /**
     *
     * @return Team information
     */
    public List<Team> getTeams() {
        return teams;
    }

    /**
     *
     * @return Match timeline data. Not included by default.
     */
    public Timeline getTimeline() {
        return timeline;
    }
}
