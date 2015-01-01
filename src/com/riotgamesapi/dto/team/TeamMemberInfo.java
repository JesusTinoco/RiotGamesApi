package com.riotgamesapi.dto.team;

/**
 * @version 2.4
 */
public class TeamMemberInfo {

    private long inviteDate;
    private long joinDate;
    private long playerId;
    private String status;

    /**
     *
     * @return Date that team member was invited to team specified as epoch milliseconds.
     */
    public long getInviteDate() {
        return inviteDate;
    }

    /**
     *
     * @return Date that team member joined team specified as epoch milliseconds.
     */
    public long getJoinDate() {
        return joinDate;
    }

    public long getPlayerId() {
        return playerId;
    }

    public String getStatus() {
        return status;
    }
}
