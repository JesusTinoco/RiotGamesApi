package dto.summoner;

import java.util.Set;

/**
 * @version 1.4
 */
public class MasteryPages {

    private Set<MasteryPage> pages;
    private long summonerId;

    /**
     *
     * @return Collection of mastery pages associated with the summoner.
     */
    public Set<MasteryPage> getPages() {
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
