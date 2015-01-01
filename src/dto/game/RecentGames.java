package dto.game;

import java.util.Set;

/**
 * @version 1.3
 */
public class RecentGames {

    private Set<Game> games;
    private long summonerId;

    /**
     *
     * @return Collection of recent games played (max 10).
     */
    public Set<Game> getGames() {
        return games;
    }

    /**
     *
     * @return Summoner ID.
     */
    public long getSummonerId() {
        return summonerId;
    }
}
