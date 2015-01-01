package dto.match;

import java.util.List;

/**
 * @version 2.2
 */
public class Event {

    private String ascendedType;
    private List<Integer> assistingParticipantIds;
    private String buildingType;
    private int creatorId;
    private String eventType;
    private int itemAfter;
    private int itemBefore;
    private int itemId;
    private int killerId;
    private String laneType;
    private String levelUpType;
    private String monsterType;
    private int participantId;
    private String pointCaptured;
    private Position position;
    private int skillSlot;
    private int teamId;
    private long timestamp;
    private String towerType;
    private int victimId;
    private String wardType;

    /**
     *
     * @return The ascended type of the event. Only present if relevant. Note that CLEAR_ASCENDED refers to when a participants kills the ascended player. (legal values: CHAMPION_ASCENDED, CLEAR_ASCENDED, MINION_ASCENDED)
     */
    public String getAscendedType() {
        return ascendedType;
    }

    /**
     *
     * @return The assisting participant IDs of the event. Only present if relevant.
     */
    public List<Integer> getAssistingParticipantIds() {
        return assistingParticipantIds;
    }

    /**
     *
     * @return The building type of the event. Only present if relevant. (legal values: INHIBITOR_BUILDING, TOWER_BUILDING)
     */
    public String getBuildingType() {
        return buildingType;
    }

    /**
     *
     * @return The creator ID of the event. Only present if relevant.
     */
    public int getCreatorId() {
        return creatorId;
    }

    /**
     *
     * @return Event type. (legal values: ASCENDED_EVENT, BUILDING_KILL, CAPTURE_POINT, CHAMPION_KILL, ELITE_MONSTER_KILL, ITEM_DESTROYED, ITEM_PURCHASED, ITEM_SOLD, ITEM_UNDO, PORO_KING_SUMMON, SKILL_LEVEL_UP, WARD_KILL, WARD_PLACED)
     */
    public String getEventType() {
        return eventType;
    }

    /**
     *
     * @return The ending item ID of the event. Only present if relevant.
     */
    public int getItemAfter() {
        return itemAfter;
    }

    /**
     *
     * @return The starting item ID of the event. Only present if relevant.
     */
    public int getItemBefore() {
        return itemBefore;
    }

    /**
     *
     * @return The item ID of the event. Only present if relevant.
     */
    public int getItemId() {
        return itemId;
    }

    /**
     *
     * @return The killer ID of the event. Only present if relevant. Killer ID 0 indicates a minion.
     */
    public int getKillerId() {
        return killerId;
    }

    /**
     *
     * @return The lane type of the event. Only present if relevant. (legal values: BOT_LANE, MID_LANE, TOP_LANE)
     */
    public String getLaneType() {
        return laneType;
    }

    /**
     *
     * @return The level up type of the event. Only present if relevant. (legal values: EVOLVE, NORMAL)
     */
    public String getLevelUpType() {
        return levelUpType;
    }

    /**
     *
     * @return The monster type of the event. Only present if relevant. (legal values: BARON_NASHOR, BLUE_GOLEM, DRAGON, RED_LIZARD, VILEMAW)
     */
    public String getMonsterType() {
        return monsterType;
    }

    /**
     *
     * @return The participant ID of the event. Only present if relevant.
     */
    public int getParticipantId() {
        return participantId;
    }

    /**
     * The point captured in the event. Only present if relevant. (legal values: POINT_A, POINT_B, POINT_C, POINT_D, POINT_E)
     * @return
     */
    public String getPointCaptured() {
        return pointCaptured;
    }

    /**
     *
     * @return The position of the event. Only present if relevant.
     */
    public Position getPosition() {
        return position;
    }

    /**
     *
     * @return The skill slot of the event. Only present if relevant.
     */
    public int getSkillSlot() {
        return skillSlot;
    }

    /**
     *
     * @return The team ID of the event. Only present if relevant.
     */
    public int getTeamId() {
        return teamId;
    }

    /**
     *
     * @return Represents how many milliseconds into the game the event occurred.
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     *
     * @return The tower type of the event. Only present if relevant. (legal values: BASE_TURRET, FOUNTAIN_TURRET, INNER_TURRET, NEXUS_TURRET, OUTER_TURRET, UNDEFINED_TURRET)
     */
    public String getTowerType() {
        return towerType;
    }

    /**
     *
     * @return The victim ID of the event. Only present if relevant.
     */
    public int getVictimId() {
        return victimId;
    }

    /**
     *
     * @return The ward type of the event. Only present if relevant. (legal values: SIGHT_WARD, TEEMO_MUSHROOM, UNDEFINED, VISION_WARD, YELLOW_TRINKET, YELLOW_TRINKET_UPGRADE)
     */
    public String getWardType() {
        return wardType;
    }
}
