package dto.stats;

/**
 * @version 1.3
 */
public class ChampionStats {

    private int id;
    private AggregatedStats stats;

    /**
     *
     * @return Champion ID. Note that champion ID 0 represents the combined stats for all champions. For static information correlating to champion IDs, please refer to the LoL Static Data API.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return Aggregated stats associated with the champion.
     */
    public AggregatedStats getStats() {
        return stats;
    }
}
