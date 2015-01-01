package dto.status;

import java.util.List;

/**
 * @version 1.0
 */
public class ShardStatus {

    private String hostname;
    private List<String> locales;
    private String name;
    private String region_tag;
    private List<Service> services;
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

    public List<Service> getServices() {
        return services;
    }

    public String getSlug() {
        return slug;
    }
}
