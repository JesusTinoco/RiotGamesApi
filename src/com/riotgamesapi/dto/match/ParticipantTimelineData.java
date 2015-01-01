/*
Copyright 2015 Jesús Rodríguez Tinoco

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

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
