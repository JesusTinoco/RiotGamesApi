package dto.summoner;

/**
 * @version 1.4
 */
public class RuneSlot {

    private int runeId;
    private int runeSlotId;

    /**
     *
     * @return Rune ID associated with the rune slot. For static information correlating to rune IDs, please refer to the LoL Static Data API.
     */
    public int getRuneSlotId() {
        return runeSlotId;
    }

    /**
     *
     * @return Rune slot ID.
     */
    public int getRuneId() {
        return runeId;
    }
}
