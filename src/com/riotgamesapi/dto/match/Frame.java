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
