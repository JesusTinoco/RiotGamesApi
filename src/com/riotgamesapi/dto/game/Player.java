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

package com.riotgamesapi.dto.game;

/**
 * @version 1.3
 */
public class Player {

    private int championId;
    private long summonerId;
    private int teamId;

    /**
     *
     * @return Champion id associated with player.
     */
    public int getChampionId() {
        return championId;
    }

    /**
     *
     * @return Summoner id associated with player.
     */
    public long getSummonerId() {
        return summonerId;
    }

    /**
     *
     * @return Team id associated with player.
     */
    public int getTeamId() {
        return teamId;
    }
}
