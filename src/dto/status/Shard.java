package dto.status;

import java.util.List;

/**
 * @version 1.0
 */
public class Shard {

    private String hostname;
    private List<String> locales;
    private String name;
    private String region_tag;
    private String slug;

    public String getHostname() {
        return hostname;
    }

    public List<String> getLocales() {
        return locales;
    }

    public String getName() {
        return name;
    }

    public String getRegion_tag() {
        return region_tag;
    }

    public String getSlug() {
        return slug;
    }
}
