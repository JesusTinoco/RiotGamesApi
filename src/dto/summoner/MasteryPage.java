package dto.summoner;

import java.util.List;

/**
 * @version 1.4
 */
public class MasteryPage {

    private boolean current;
    private long id;
    private List<Mastery> masteries;
    private String name;

    /**
     *
     * @return Indicates if the mastery page is the current mastery page.
     */
    public boolean isCurrent() {
        return current;
    }

    /**
     *
     * @return Mastery page ID.
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @return Collection of masteries associated with the mastery page.
     */
    public List<Mastery> getMasteries() {
        return masteries;
    }

    /**
     *
     * @return Mastery page name.
     */
    public String getName() {
        return name;
    }
}
