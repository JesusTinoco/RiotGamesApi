package dto.stats;

/**
 * Created by Desarrollo on 29/12/14.
 */
public class PlayerStatsSummary {

    private AggregatedStats aggregatedStats;
    private int losses;
    private long modifyDate;
    private String playerStatsSummaryType;
    private int wins;

    /**
     *
     * @return Aggregated stats.
     */
    public AggregatedStats getAggregatedStats() {
        return aggregatedStats;
    }

    /**
     *
     * @return Number of losses for this queue type. Returned for ranked queue types only.
     */
    public int getLosses() {
        return losses;
    }

    /**
     *
     * @return Date stats were last modified specified as epoch milliseconds.
     */
    public long getModifyDate() {
        return modifyDate;
    }

    /**
     *
     * @return Player stats summary type. (legal values: AramUnranked5x5, CoopVsAI, CoopVsAI3x3, OdinUnranked, RankedPremade3x3, RankedPremade5x5, RankedSolo5x5, RankedTeam3x3, RankedTeam5x5, Unranked, Unranked3x3, OneForAll5x5, FirstBlood1x1, FirstBlood2x2, SummonersRift6x6, CAP5x5, URF, URFBots, NightmareBot, Ascension, Hexakill, KingPoro)
     */
    public String getPlayerStatsSummaryType() {
        return playerStatsSummaryType;
    }

    /**
     *
     * @return Number of wins for this queue type.
     */
    public int getWins() {
        return wins;
    }
}
