package dto.league;

/**
 * @version 2.5
 */
public class LeagueEntry {

    private String division;
    private boolean idFreshBlood;
    private boolean isHotStreak;
    private boolean isInactive;
    private boolean isVeteran;
    private int leaguePoints;
    private MiniSeries miniSeries;
    private String playerOrTeamId;
    private String playerOrTeamName;
    private int wins;

    /**
     * @return The league division of the participant.
     */
    public String getDivision() {
        return division;
    }

    /**
     * @return Specifies if the participant is fresh blood.
     */
    public boolean isIdFreshBlood() {
        return idFreshBlood;
    }

    /**
     * @return Specifies if the participant is on a hot streak.
     */
    public boolean isHotStreak() {
        return isHotStreak;
    }

    /**
     * @return Specifies if the participant is inactive.
     */
    public boolean isInactive() {
        return isInactive;
    }

    /**
     * @return Specifies if the participant is a veteran.
     */
    public boolean isVeteran() {
        return isVeteran;
    }

    /**
     * @return The league points of the participant.
     */
    public int getLeaguePoints() {
        return leaguePoints;
    }

    /**
     * @return Mini series data for the participant. Only present if the participant is currently in a mini series.
     */
    public MiniSeries getMiniSeries() {
        return miniSeries;
    }

    /**
     * @return The ID of the participant (i.e., summoner or team) represented by this entry.
     */
    public String getPlayerOrTeamId() {
        return playerOrTeamId;
    }

    /**
     * @return The name of the the participant (i.e., summoner or team) represented by this entry.
     */
    public String getPlayerOrTeamName() {
        return playerOrTeamName;
    }

    /**
     * @return The number of wins for the participant.
     */
    public int getWins() {
        return wins;
    }
}
