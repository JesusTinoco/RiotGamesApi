package com.riotgamesapi.dto.summoner;

import java.util.Set;

/**
 * Created by Desarrollo on 29/12/14.
 */
public class RunePages {

    private Set<RunePage> pages;
    private long summonerId;

    /**
     *
     * @return Collection of rune pages associated with the summoner.
     */
    public Set<RunePage> getPages() {
        return pages;
    }

    /**
     *
     * @return Summoner ID.
     */
    public long getSummonerId() {
        return summonerId;
    }
}
