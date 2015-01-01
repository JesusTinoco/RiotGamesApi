package dto.staticData;

import java.util.Map;

/**
 * @version 1.2
 */
public class ChampionList {

    private Map<String, Champion> data;
    private String format;
    private Map<String, String> keys;
    private String type;
    private String version;

    public Map<String, Champion> getData() {
        return data;
    }

    public String getFormat() {
        return format;
    }

    public Map<String, String> getKeys() {
        return keys;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}