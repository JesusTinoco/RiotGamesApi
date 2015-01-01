package com.riotgamesapi.dto.staticData;

import java.util.List;

/**
 * @version 1.2
 */
public class MasteryTree {

    private List<MasteryTreeList> Defense;
    private List<MasteryTreeList> Offense;
    private List<MasteryTreeList> Utility;

    public List<MasteryTreeList> getDefense() {
        return Defense;
    }

    public List<MasteryTreeList> getOffense() {
        return Offense;
    }

    public List<MasteryTreeList> getUtility() {
        return Utility;
    }
}
