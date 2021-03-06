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

import java.util.List;

/**
 * @version 1.3
 */
public class RankedStats {

    private List<ChampionStats> champions;
    private long modifyDate;
    private long summonerId;

    /**
     *
     * @return Collection of aggregated stats summarized by champion.
     */
    public List<ChampionStats> getChampions() {
        return champions;
    }

    /**
     *
     * @return Date stats were last modified specified as epoch milliseconds.
     */
    public long getModifyDate() {
        return modifyDate;
    }

    /**
     *
     * @return Summoner ID.
     */
    public long getSummonerId() {
        return summonerId;
    }
}
