package com.riotgamesapi.dto.match;

/**
 * @version 2.2
 */
public class ParticipantIdentity {

    private int participantId;
    private Player player;

    /**
     * @return Participant ID
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return Player information
     */
    public int getParticipantId() {
        return participantId;
    }
}
