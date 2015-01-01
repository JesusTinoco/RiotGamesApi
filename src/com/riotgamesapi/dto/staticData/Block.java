package com.riotgamesapi.dto.staticData;

import java.util.List;

/**
 * @version 1.2
 */
public class Block {

    private List<BlockItem> items;
    private boolean recMath;
    private String type;

    public List<BlockItem> getItems() {
        return items;
    }

    public boolean isRecMath() {
        return recMath;
    }

    public String getType() {
        return type;
    }
}
