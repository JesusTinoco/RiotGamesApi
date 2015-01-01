package dto.champion;

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
