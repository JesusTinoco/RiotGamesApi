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
import java.util.Map;

/**
 * @version 2.2
 */
public class Frame {

    private List<Event> events;
    private Map<String, ParticipantFrame> participantFrames;
    private long timestamp;

    /**
     *
     * @return List of events for this frame.
     */
    public List<Event> getEvents() {
        return events;
    }

    /**
     *
     * @return List of events for this frame.
     */
    public Map<String, ParticipantFrame> getParticipantFrames() {
        return participantFrames;
    }

    /**
     *
     * @return Represents how many milliseconds into the game the frame occurred.
     */
    public long getTimestamp() {
        return timestamp;
    }
}
