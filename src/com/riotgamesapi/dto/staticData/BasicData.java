/*
Copyright 2015 Jesús Rodríguez Tinoco

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.riotgamesapi.dto.staticData;

import java.util.List;
import java.util.Map;

/**
 * @version 1.2
 */
public class BasicData {

    private String colloq;
    private boolean consumeOnFull;
    private boolean consumed;
    private int depth;
    private String description;
    private List<String> from;
    private Gold gold;
    private String group;
    private boolean hideFromAll;
    private int id;
    private Image image;
    private boolean inStore;
    private List<String> into;
    private Map<String, Boolean> maps;
    private String name;
    private String plainText;
    private String requiredChampion;
    private MetaData rune;
    private String sanitizedDescription;
    private int specialRecipe;
    private int stacks;
    private BasicDataStats stats;
    private List<String> tags;

    public String getColloq() {
        return colloq;
    }

    public boolean isConsumeOnFull() {
        return consumeOnFull;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public int getDepth() {
        return depth;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getFrom() {
        return from;
    }

    public Gold getGold() {
        return gold;
    }

    public String getGroup() {
        return group;
    }

    public boolean isHideFromAll() {
        return hideFromAll;
    }

    public int getId() {
        return id;
    }

    public Image getImage() {
        return image;
    }

    public boolean isInStore() {
        return inStore;
    }

    public List<String> getInto() {
        return into;
    }

    public Map<String, Boolean> getMaps() {
        return maps;
    }

    public String getName() {
        return name;
    }

    public String getPlainText() {
        return plainText;
    }

    public String getRequiredChampion() {
        return requiredChampion;
    }

    public MetaData getRune() {
        return rune;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public int getSpecialRecipe() {
        return specialRecipe;
    }

    public int getStacks() {
        return stacks;
    }

    public BasicDataStats getStats() {
        return stats;
    }

    public List<String> getTags() {
        return tags;
    }
}
