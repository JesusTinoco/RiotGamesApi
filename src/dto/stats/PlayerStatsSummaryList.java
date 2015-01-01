package dto.stats;

import java.util.List;

/**
 * @version 1.3
 */
public class PlayerStatsSummaryList {

    private List<PlayerStatsSummary> playerStatSummaries;
    private long summonerId;

    /**
     *
     * @return Collection of player stats summaries associated with the summoner.
     */
    public List<PlayerStatsSummary> getPlayerStatSummaries() {
        return playerStatSummaries;
    }

    /**
     *
     * @return Summoner ID.
     */
    public long getSummonerId() {
        return summonerId;
    }
}
