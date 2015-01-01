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
