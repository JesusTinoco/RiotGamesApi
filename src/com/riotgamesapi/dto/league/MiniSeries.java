package com.riotgamesapi.dto.league;

/**
 * @version 2.5
 */
public class MiniSeries {

    private int losses;
    private String progress;
    private int target;
    private int wins;

    /**
     * @return Number of current losses in the mini series.
     */
    public int getLosses() {
        return losses;
    }

    /**
     * @return String showing the current, sequential mini series progress where 'W' represents a win, 'L' represents a loss, and 'N' represents a game that hasn't been played yet.
     */
    public String getProgress() {
        return progress;
    }

    /**
     * @return Number of wins required for promotion.
     */
    public int getTarget() {
        return target;
    }

    /**
     * @return Number of current wins in the mini series.
     */
    public int getWins() {
        return wins;
    }
}
