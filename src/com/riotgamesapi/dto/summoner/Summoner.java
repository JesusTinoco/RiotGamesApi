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

package com.riotgamesapi.dto.summoner;

/**
 * @version 1.4
 */
public class Summoner {

    private long id;
    private String name;
    private int profileIconId;
    private long revisionDate;
    private long summonerLevel;

    /**
     *
     * @return Summoner ID.
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @return Summoner name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return ID of the summoner icon associated with the summoner.
     */
    public int getProfileIconId() {
        return profileIconId;
    }

    /**
     *
     * @return Date summoner was last modified specified as epoch milliseconds. The following events will update this timestamp: profile icon change, playing the tutorial or advanced tutorial, finishing a game, summoner name change
     */
    public long getRevisionDate() {
        return revisionDate;
    }

    /**
     *
     * @return Summoner level associated with the summoner.
     */
    public long getSummonerLevel() {
        return summonerLevel;
    }
}
