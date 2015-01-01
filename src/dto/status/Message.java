package dto.status;

import java.util.List;

/**
 * @version 1.0
 */
public class Message {

    private String author;
    private String content;
    private String created_at;
    private long id;
    private String severity;
    private List<Translation> translations;
    private String update_at;

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getCreated_at() {
        return created_at;
    }

    public long getId() {
        return id;
    }

    public String getSeverity() {
        return severity;
    }

    public List<Translation> getTranslations() {
        return translations;
    }

    public String getUpdate_at() {
        return update_at;
    }
}
