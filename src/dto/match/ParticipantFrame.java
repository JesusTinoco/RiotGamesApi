package dto.match;

/**
 * @version 2.2
 */
public class ParticipantFrame {

    private int currentGold;
    private int jungleMinionsKilled;
    private int level;
    private int minionsKilled;
    private int participantId;
    private Position position;
    private int totalGold;
    private int xp;

    /**
     *
     * @return Participant's current gold
     */
    public int getCurrentGold() {
        return currentGold;
    }

    /**
     *
     * @return Number of jungle minions killed by participant
     */
    public int getJungleMinionsKilled() {
        return jungleMinionsKilled;
    }

    /**
     *
     * @return Participant's current level
     */
    public int getLevel() {
        return level;
    }

    /**
     *
     * @return Number of minions killed by participant
     */
    public int getMinionsKilled() {
        return minionsKilled;
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
     * @return Participant's position
     */
    public Position getPosition() {
        return position;
    }

    /**
     *
     * @return Participant's total gold
     */
    public int getTotalGold() {
        return totalGold;
    }

    /**
     *
     * @return Experience earned by participant
     */
    public int getXp() {
        return xp;
    }
}
