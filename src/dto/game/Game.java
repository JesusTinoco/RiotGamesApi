package dto.game;

import java.util.List;

/**
 * @version 1.3
 */
public class Game {

    private int championId;
    private long createDate;
    private List<Player> fellowPlayers;
    private long gameId;
    private String gameMode;
    private String gameType;
    private boolean invalid;
    private int ipEarned;
    private int level;
    private int mapId;
    private int spell1;
    private int spell2;
    private RawStats stats;
    private String subType;
    private int teamId;

    /**
     *
     * @return Champion ID associated with game.
     */
    public int getChampionId() {
        return championId;
    }

    /**
     *
     * @return Date that end game data was recorded, specified as epoch milliseconds.
     */
    public long getCreateDate() {
        return createDate;
    }

    /**
     *
     * @return Other players associated with the game.
     */
    public List<Player> getFellowPlayers() {
        return fellowPlayers;
    }

    /**
     *
     * @return Game ID.
     */
    public long getGameId() {
        return gameId;
    }

    /**
     *
     * @return Game mode. (legal values: CLASSIC, ODIN, ARAM, TUTORIAL, ONEFORALL, ASCENSION, FIRSTBLOOD, KINGPORO)
     */
    public String getGameMode() {
        return gameMode;
    }

    /**
     *
     * @return Game type. (legal values: CUSTOM_GAME, MATCHED_GAME, TUTORIAL_GAME)
     */
    public String getGameType() {
        return gameType;
    }

    /**
     *
     * @return Invalid flag.
     */
    public boolean isInvalid() {
        return invalid;
    }

    /**
     *
     * @return IP Earned.
     */
    public int getIpEarned() {
        return ipEarned;
    }

    /**
     *
     * @return Level.
     */
    public int getLevel() {
        return level;
    }

    /**
     *
     * @return Map ID.
     */
    public int getMapId() {
        return mapId;
    }

    /**
     *
     * @return ID of first summoner spell.
     */
    public int getSpell1() {
        return spell1;
    }

    /**
     *
     * @return ID of second summoner spell.
     */
    public int getSpell2() {
        return spell2;
    }

    /**
     *
     * @return Statistics associated with the game for this summoner.
     */
    public RawStats getStats() {
        return stats;
    }

    /**
     *
     * @return Game sub-type. (legal values: NONE, NORMAL, BOT, RANKED_SOLO_5x5, RANKED_PREMADE_3x3, RANKED_PREMADE_5x5, ODIN_UNRANKED, RANKED_TEAM_3x3, RANKED_TEAM_5x5, NORMAL_3x3, BOT_3x3, CAP_5x5, ARAM_UNRANKED_5x5, ONEFORALL_5x5, FIRSTBLOOD_1x1, FIRSTBLOOD_2x2, SR_6x6, URF, URF_BOT, NIGHTMARE_BOT, ASCENSION, HEXAKILL, KING_PORO)
     */
    public String getSubType() {
        return subType;
    }

    /**
     *
     * @return Team ID associated with game. Team ID 100 is blue team. Team ID 200 is purple team.
     */
    public int getTeamId() {
        return teamId;
    }
}
