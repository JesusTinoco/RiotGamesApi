package com.riotgamesapi.dto.stats;

import java.util.List;

/**
 * @version 1.3
 */
public class RankedStats {

    private List<ChampionStats> champions;
    private long modifyDate;
    private long summonerId;

    /**
     *
     * @return Collection of aggregated stats summarized by champion.
     */
    public List<ChampionStats> getChampions() {
        return champions;
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
     * @return Summoner ID.
     */
    public long getSummonerId() {
        return summonerId;
    }
}
