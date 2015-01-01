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

package com.riotgamesapi.dto.champion;

/**
 * @version 1.2
 */
public class Champion {

    private boolean active;
    private boolean botEnabled;
    private boolean botMmEnabled;
    private boolean freeToPlay;
    private long id;
    private boolean rankedPlayEnabled;

    /**
     *
     * @return Indicates if the champion is active.
     */
    public boolean isActive() {
        return active;
    }

    /**
     *
     * @return Bot enabled flag (for custom games).
     */
    public boolean isBotEnabled() {
        return botEnabled;
    }

    /**
     *
     * @return Indicates if the champion is free to play. Free to play champions are rotated periodically.
     */
    public boolean isFreeToPlay() {
        return freeToPlay;
    }

    /**
     *
     * @return Bot Match Made enabled flag (for Co-op vs. AI games).
     */
    public boolean isBotMmEnabled() {
        return botMmEnabled;
    }

    /**
     *
     * @return Champion ID. For static information correlating to champion IDs, please refer to the LoL Static Data API.
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @return Ranked play enabled flag.
     */
    public boolean isRankedPlayEnabled() {
        return rankedPlayEnabled;
    }
}
