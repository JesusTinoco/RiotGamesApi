package com.riotgamesapi.dto.staticData;

import java.util.Map;

/**
 * @version 1.2
 */
public class MasteryList {

    private Map<String, Mastery> data;
    private MasteryTree tree;
    private String type;
    private String version;

    public Map<String, Mastery> getData() {
        return data;
    }

    public MasteryTree getTree() {
        return tree;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}
