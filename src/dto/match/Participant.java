package dto.match;

import java.util.List;

/**
 * @version 2.2
 */
public class Participant {

    private int championId;
    private String highestAchievedSeasonTier;
    private List<Mastery> masteries;
    private int participantId;
    private List<Rune> runes;
    private int spell1Id;
    private int spell2id;
    private ParticipantStats stats;
    private int teamId;
    private ParticipantTimeline timeline;

    /**
     *
     * @return Champion ID
     */
    public int getChampionId() {
        return championId;
    }

    /**
     *
     * @return Highest ranked tier achieved for the previous season, if any, otherwise null. Used to display border in game loading screen. (legal values: CHALLENGER, MASTER, DIAMOND, PLATINUM, GOLD, SILVER, BRONZE, UNRANKED)
     */
    public String getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    /**
     *
     * @return List of mastery information
     */
    public List<Mastery> getMasteries() {
        return masteries;
    }

    /**
     *
     * @return Participant ID
     */
    public int getParticipantId() {
        return participantId;
    }

    /**
     *
     * @return List of rune information
     */
    public List<Rune> getRunes() {
        return runes;
    }

    /**
     *
     * @return First summoner spell ID
     */
    public int getSpell1Id() {
        return spell1Id;
    }

    /**
     *
     * @return Second summoner spell ID
     */
    public int getSpell2id() {
        return spell2id;
    }

    /**
     *
     * @return Participant statistics
     */
    public ParticipantStats getStats() {
        return stats;
    }

    /**
     *
     * @return Team ID
     */
    public int getTeamId() {
        return teamId;
    }

    /**
     *
     * @return Timeline data. Delta fields refer to values for the specified period (e.g., the gold per minute over the first 10 minutes of the game versus the second 20 minutes of the game. Diffs fields refer to the deltas versus the calculated lane opponent(s).
     */
    public ParticipantTimeline getTimeline() {
        return timeline;
    }
}
