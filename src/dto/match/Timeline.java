package dto.match;

import java.util.List;

/**
 * @version 2.2
 */
public class Timeline {

    private long frameInterval;
    private List<Frame> frames;

    /**
     *
     * @return Time between each returned frame in milliseconds.
     */
    public long getFrameInterval() {
        return frameInterval;
    }

    /**
     *
     * @return List of timeline frames for the game.
     */
    public List<Frame> getFrames() {
        return frames;
    }
}
