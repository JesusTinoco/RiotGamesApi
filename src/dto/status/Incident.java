package dto.status;

import java.util.List;

/**
 * @version
 */
public class Incident {

    private boolean active;
    private String created_at;
    private long id;
    private List<Message> updates;

    public boolean isActive() {
        return active;
    }

    public String getCreated_at() {
        return created_at;
    }

    public long getId() {
        return id;
    }

    public List<Message> getUpdates() {
        return updates;
    }
}
