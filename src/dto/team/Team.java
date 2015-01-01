package dto.team;

import java.util.List;

/**
 * @version 2.4
 */
public class Team {

    private long createDate;
    private String fullId;
    private long lastGameDate;
    private long lastJoinDate;
    private long lastJoinedRankedTeamQueueDate;
    private List<MatchHistorySummary> matchHistory;
    private long modifyDate;
    private String name;
    private Roster roster;
    private long secondLastJoinDate;
    private String status;
    private String tag;
    private List<TeamStatDetail> teamStatDetails;
    private long thirdLastJoinDate;

    /**
     *
     * @return Date that team was created specified as epoch milliseconds.
     */
    public long getCreateDate() {
        return createDate;
    }

    public String getFullId() {
        return fullId;
    }

    /**
     *
     * @return Date that last game played by team ended specified as epoch milliseconds.
     */
    public long getLastGameDate() {
        return lastGameDate;
    }

    /**
     *
     * @return Date that last member joined specified as epoch milliseconds.
     */
    public long getLastJoinDate() {
        return lastJoinDate;
    }

    /**
     *
     * @return Date that team last joined the ranked team queue specified as epoch milliseconds.
     */
    public long getLastJoinedRankedTeamQueueDate() {
        return lastJoinedRankedTeamQueueDate;
    }

    public List<MatchHistorySummary> getMatchHistory() {
        return matchHistory;
    }

    /**
     *
     * @return Date that team was last modified specified as epoch milliseconds.
     */
    public long getModifyDate() {
        return modifyDate;
    }

    public String getName() {
        return name;
    }

    public Roster getRoster() {
        return roster;
    }

    /**
     *
     * @return Date that second to last member joined specified as epoch milliseconds.
     */
    public long getSecondLastJoinDate() {
        return secondLastJoinDate;
    }

    public String getStatus() {
        return status;
    }

    public String getTag() {
        return tag;
    }

    public List<TeamStatDetail> getTeamStatDetails() {
        return teamStatDetails;
    }

    /**
     *
     * @return Date that third to last member joined specified as epoch milliseconds.
     */
    public long getThirdLastJoinDate() {
        return thirdLastJoinDate;
    }
}
