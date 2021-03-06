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
public class ParticipantTimeline {

    private ParticipantTimelineData ancientGolemAssistsPerMinCounts;
    private ParticipantTimelineData ancientGolemKillsPerMinCounts;
    private ParticipantTimelineData assistedLaneDeathsPerMinDeltas;
    private ParticipantTimelineData assistedLaneKillsPerMinDeltas;
    private ParticipantTimelineData baronAssistsPerMinCounts;
    private ParticipantTimelineData baronKillsPerMinCounts;
    private ParticipantTimelineData creepsPerMinDeltas;
    private ParticipantTimelineData csDiffPerMinDeltas;
    private ParticipantTimelineData damageTakenDiffPerMinDeltas;
    private ParticipantTimelineData damageTakenPerMinDeltas;
    private ParticipantTimelineData dragonAssistsPerMinCounts;
    private ParticipantTimelineData dragonKillsPerMinCounts;
    private ParticipantTimelineData elderLizardAssistsPerMinCounts;
    private ParticipantTimelineData elderLizardKillsPerMinCounts;
    private ParticipantTimelineData goldPerMinDeltas;
    private ParticipantTimelineData inhibitorAssistsPerMinCounts;
    private ParticipantTimelineData inhibitorKillsPerMinCounts;
    private String lane;
    private String role;
    private ParticipantTimelineData towerAssistsPerMinCounts;
    private ParticipantTimelineData towerKillsPerMinCounts;
    private ParticipantTimelineData towerKillsPerMinDeltas;
    private ParticipantTimelineData vilemawAssistsPerMinCounts;
    private ParticipantTimelineData vilemawKillsPerMinCounts;
    private ParticipantTimelineData wardsPerMinDeltas;
    private ParticipantTimelineData xpDiffPerMinDeltas;
    private ParticipantTimelineData xpPerMinDeltas;

    /**
     *
     * @return Ancient golem assists per minute timeline counts
     */
    public ParticipantTimelineData getAncientGolemAssistsPerMinCounts() {
        return ancientGolemAssistsPerMinCounts;
    }

    /**
     *
     * @return Ancient golem kills per minute timeline counts
     */
    public ParticipantTimelineData getAncientGolemKillsPerMinCounts() {
        return ancientGolemKillsPerMinCounts;
    }

    /**
     *
     * @return Assisted lane deaths per minute timeline data
     */
    public ParticipantTimelineData getAssistedLaneDeathsPerMinDeltas() {
        return assistedLaneDeathsPerMinDeltas;
    }

    /**
     *
     * @return Assisted lane kills per minute timeline data
     */
    public ParticipantTimelineData getAssistedLaneKillsPerMinDeltas() {
        return assistedLaneKillsPerMinDeltas;
    }

    /**
     *
     * @return Baron assists per minute timeline counts
     */
    public ParticipantTimelineData getBaronAssistsPerMinCounts() {
        return baronAssistsPerMinCounts;
    }

    /**
     *
     * @return Baron kills per minute timeline counts
     */
    public ParticipantTimelineData getBaronKillsPerMinCounts() {
        return baronKillsPerMinCounts;
    }

    /**
     *
     * @return Creeps per minute timeline data
     */
    public ParticipantTimelineData getCreepsPerMinDeltas() {
        return creepsPerMinDeltas;
    }

    /**
     *
     * @return Creep score difference per minute timeline data
     */
    public ParticipantTimelineData getCsDiffPerMinDeltas() {
        return csDiffPerMinDeltas;
    }

    /**
     *
     * @return Damage taken difference per minute timeline data
     */
    public ParticipantTimelineData getDamageTakenDiffPerMinDeltas() {
        return damageTakenDiffPerMinDeltas;
    }

    /**
     *
     * @return Damage taken per minute timeline data
     */
    public ParticipantTimelineData getDamageTakenPerMinDeltas() {
        return damageTakenPerMinDeltas;
    }

    /**
     *
     * @return Dragon assists per minute timeline counts
     */
    public ParticipantTimelineData getDragonAssistsPerMinCounts() {
        return dragonAssistsPerMinCounts;
    }

    /**
     *
     * @return Dragon kills per minute timeline counts
     */
    public ParticipantTimelineData getDragonKillsPerMinCounts() {
        return dragonKillsPerMinCounts;
    }

    /**
     *
     * @return Elder lizard assists per minute timeline counts
     */
    public ParticipantTimelineData getElderLizardAssistsPerMinCounts() {
        return elderLizardAssistsPerMinCounts;
    }

    /**
     *
     * @return Elder lizard kills per minute timeline counts
     */
    public ParticipantTimelineData getElderLizardKillsPerMinCounts() {
        return elderLizardKillsPerMinCounts;
    }

    /**
     *
     * @return Gold per minute timeline data
     */
    public ParticipantTimelineData getGoldPerMinDeltas() {
        return goldPerMinDeltas;
    }

    /**
     *
     * @return Inhibitor assists per minute timeline counts
     */
    public ParticipantTimelineData getInhibitorAssistsPerMinCounts() {
        return inhibitorAssistsPerMinCounts;
    }

    /**
     *
     * @return Inhibitor kills per minute timeline counts
     */
    public ParticipantTimelineData getInhibitorKillsPerMinCounts() {
        return inhibitorKillsPerMinCounts;
    }

    /**
     *
     * @return Participant's lane (legal values: MID, MIDDLE, TOP, JUNGLE, BOT, BOTTOM)
     */
    public String getLane() {
        return lane;
    }

    /**
     *
     * @return Participant's role (legal values: DUO, NONE, SOLO, DUO_CARRY, DUO_SUPPORT)
     */
    public String getRole() {
        return role;
    }

    /**
     *
     * @return Tower assists per minute timeline counts
     */
    public ParticipantTimelineData getTowerAssistsPerMinCounts() {
        return towerAssistsPerMinCounts;
    }

    /**
     *
     * @return Tower kills per minute timeline counts
     */
    public ParticipantTimelineData getTowerKillsPerMinCounts() {
        return towerKillsPerMinCounts;
    }

    /**
     *
     * @return Tower kills per minute timeline data
     */
    public ParticipantTimelineData getTowerKillsPerMinDeltas() {
        return towerKillsPerMinDeltas;
    }

    /**
     *
     * @return Vilemaw assists per minute timeline counts
     */
    public ParticipantTimelineData getVilemawAssistsPerMinCounts() {
        return vilemawAssistsPerMinCounts;
    }

    /**
     *
     * @return Vilemaw kills per minute timeline counts
     */
    public ParticipantTimelineData getVilemawKillsPerMinCounts() {
        return vilemawKillsPerMinCounts;
    }

    /**
     *
     * @return Wards placed per minute timeline data
     */
    public ParticipantTimelineData getWardsPerMinDeltas() {
        return wardsPerMinDeltas;
    }

    /**
     *
     * @return Experience difference per minute timeline data
     */
    public ParticipantTimelineData getXpDiffPerMinDeltas() {
        return xpDiffPerMinDeltas;
    }

    /**
     *
     * @return Experience per minute timeline data
     */
    public ParticipantTimelineData getXpPerMinDeltas() {
        return xpPerMinDeltas;
    }
}
