package dto.matchHistory;

import java.util.List;

/**
 * @version 2.2
 */
public class PlayerHistory {

    private List<MatchSummary> matches;

    /**
     *
     * @return List of matches for the player
     */
    public List<MatchSummary> getMatches() {
        return matches;
    }
}
