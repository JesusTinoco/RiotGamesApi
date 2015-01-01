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

package com.riotgamesapi.dto.stats;

/**
 * @version 1.3
 */
public class ChampionStats {

    private int id;
    private AggregatedStats stats;

    /**
     *
     * @return Champion ID. Note that champion ID 0 represents the combined stats for all champions. For static information correlating to champion IDs, please refer to the LoL Static Data API.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return Aggregated stats associated with the champion.
     */
    public AggregatedStats getStats() {
        return stats;
    }
}
