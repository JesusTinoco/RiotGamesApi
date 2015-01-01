package com.riotgamesapi.dto.staticData;

import java.util.List;
import java.util.Map;

/**
 * @version 1.2
 */
public class ItemList {

    private BasicData basic;
    private Map<String, Item> data;
    private List<Group> groups;
    private List<ItemTree> tree;
    private String type;
    private String version;

    public BasicData getBasic() {
        return basic;
    }

    public Map<String, Item> getData() {
        return data;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public List<ItemTree> getTree() {
        return tree;
    }

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }
}