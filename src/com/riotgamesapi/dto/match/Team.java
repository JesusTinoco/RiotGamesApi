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

import java.util.List;

/**
 * @version 2.2
 */
public class Team {

    private List<BannedChampion> bans;
    private int baronKills;
    private long dominionVictoryScore;
    private int dragonKills;
    private boolean firstBaron;
    private boolean firstBlood;
    private boolean firstDragon;
    private boolean firstInhibitor;
    private boolean firstTower;
    private int inhibitorKills;
    private int teamId;
    private int towerKills;
    private int vilemawKills;
    private boolean winner;

    /**
     *
     * @return If game was draft mode, contains banned champion data, otherwise null
     */
    public List<BannedChampion> getBans() {
        return bans;
    }

    /**
     *
     * @return Number of times the team killed baron
     */
    public int getBaronKills() {
        return baronKills;
    }

    /**
     *
     * @return If game was a dominion game, specifies the points the team had at game end, otherwise null
     */
    public long getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    /**
     *
     * @return Number of times the team killed dragon
     */
    public int getDragonKills() {
        return dragonKills;
    }

    /**
     *
     * @return Flag indicating whether or not the team got the first baron kill
     */
    public boolean isFirstBaron() {
        return firstBaron;
    }

    /**
     *
     * @return Flag indicating whether or not the team got first blood
     */
    public boolean isFirstBlood() {
        return firstBlood;
    }

    /**
     *
     * @return Flag indicating whether or not the team got the first dragon kill
     */
    public boolean isFirstDragon() {
        return firstDragon;
    }

    /**
     *
     * @return Flag indicating whether or not the team destroyed the first inhibitor
     */
    public boolean isFirstInhibitor() {
        return firstInhibitor;
    }

    /**
     *
     * @return Flag indicating whether or not the team destroyed the first tower
     */
    public boolean isFirstTower() {
        return firstTower;
    }

    /**
     *
     * @return Number of inhibitors the team destroyed
     */
    public int getInhibitorKills() {
        return inhibitorKills;
    }

    /**
     *
     * @return Team ID
     */
    public int getTeamId() {
        return teamId;
    }

    /**
     *
     * @return Number of towers the team destroyed
     */
    public int getTowerKills() {
        return towerKills;
    }

    /**
     *
     * @return Number of times the team killed vilemaw
     */
    public int getVilemawKills() {
        return vilemawKills;
    }

    /**
     *
     * @return Flag indicating whether or not the team won
     */
    public boolean isWinner() {
        return winner;
    }
}
