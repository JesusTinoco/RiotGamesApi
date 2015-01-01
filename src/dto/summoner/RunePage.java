package dto.summoner;

import java.util.Set;

/**
 * @version 1.4
 */
public class RunePage {

    private boolean current;
    private long id;
    private String name;
    private Set<RuneSlot> slots;

    /**
     *
     * @return Indicates if the page is the current page.
     */
    public boolean isCurrent() {
        return current;
    }

    /**
     *
     * @return Rune page ID.
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @return Rune page name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return Collection of rune slots associated with the rune page.
     */
    public Set<RuneSlot> getSlots() {
        return slots;
    }
}
