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

package com.riotgamesapi.dto.team;

import java.util.List;

/**
 * @version 2.4
 */
public class Team {

    private long createDate;
    private String fullId;
    private long lastGameDate;
    private long lastJoinDate;
    private long lastJoinedRankedTeamQueueDate;
    private List<MatchHistorySummary> matchHistory;
    private long modifyDate;
    private String name;
    private Roster roster;
    private long secondLastJoinDate;
    private String status;
    private String tag;
    private List<TeamStatDetail> teamStatDetails;
    private long thirdLastJoinDate;

    /**
     *
     * @return Date that team was created specified as epoch milliseconds.
     */
    public long getCreateDate() {
        return createDate;
    }

    public String getFullId() {
        return fullId;
    }

    /**
     *
     * @return Date that last game played by team ended specified as epoch milliseconds.
     */
    public long getLastGameDate() {
        return lastGameDate;
    }

    /**
     *
     * @return Date that last member joined specified as epoch milliseconds.
     */
    public long getLastJoinDate() {
        return lastJoinDate;
    }

    /**
     *
     * @return Date that team last joined the ranked team queue specified as epoch milliseconds.
     */
    public long getLastJoinedRankedTeamQueueDate() {
        return lastJoinedRankedTeamQueueDate;
    }

    public List<MatchHistorySummary> getMatchHistory() {
        return matchHistory;
    }

    /**
     *
     * @return Date that team was last modified specified as epoch milliseconds.
     */
    public long getModifyDate() {
        return modifyDate;
    }

    public String getName() {
        return name;
    }

    public Roster getRoster() {
        return roster;
    }

    /**
     *
     * @return Date that second to last member joined specified as epoch milliseconds.
     */
    public long getSecondLastJoinDate() {
        return secondLastJoinDate;
    }

    public String getStatus() {
        return status;
    }

    public String getTag() {
        return tag;
    }

    public List<TeamStatDetail> getTeamStatDetails() {
        return teamStatDetails;
    }

    /**
     *
     * @return Date that third to last member joined specified as epoch milliseconds.
     */
    public long getThirdLastJoinDate() {
        return thirdLastJoinDate;
    }
}
