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
public class ParticipantFrame {

    private int currentGold;
    private int jungleMinionsKilled;
    private int level;
    private int minionsKilled;
    private int participantId;
    private Position position;
    private int totalGold;
    private int xp;

    /**
     *
     * @return Participant's current gold
     */
    public int getCurrentGold() {
        return currentGold;
    }

    /**
     *
     * @return Number of jungle minions killed by participant
     */
    public int getJungleMinionsKilled() {
        return jungleMinionsKilled;
    }

    /**
     *
     * @return Participant's current level
     */
    public int getLevel() {
        return level;
    }

    /**
     *
     * @return Number of minions killed by participant
     */
    public int getMinionsKilled() {
        return minionsKilled;
    }

    /**
     *
     * @return Participant ID
     */
    public int getParticipantId() {
        return participantId;
    }

    /**
     *
     * @return Participant's position
     */
    public Position getPosition() {
        return position;
    }

    /**
     *
     * @return Participant's total gold
     */
    public int getTotalGold() {
        return totalGold;
    }

    /**
     *
     * @return Experience earned by participant
     */
    public int getXp() {
        return xp;
    }
}
