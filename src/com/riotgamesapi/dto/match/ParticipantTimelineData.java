package com.riotgamesapi.dto.match;

/**
 * @version 2.2
 */
public class ParticipantTimelineData {

    private double tenToTwenty;
    private double thirtyToEnd;
    private double twentyToThirty;
    private double zeroToTen;

    /**
     *
     * @return Value per minute from 10 min to 20 min
     */
    public double getTenToTwenty() {
        return tenToTwenty;
    }

    /**
     *
     * @return Value per minute from 30 min to the end of the game
     */
    public double getThirtyToEnd() {
        return thirtyToEnd;
    }

    /**
     *
     * @return Value per minute from 20 min to 30 min
     */
    public double getTwentyToThirty() {
        return twentyToThirty;
    }

    /**
     *
     * @return Value per minute from the beginning of the game to 10 min
     */
    public double getZeroToTen() {
        return zeroToTen;
    }
}
