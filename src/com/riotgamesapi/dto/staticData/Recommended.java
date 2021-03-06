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

/**
 * @version 1.2
 */
public class Recommended {

    private List<Block> blocks;
    private String champion;
    private String map;
    private String mode;
    private boolean priority;
    private String title;
    private String type;

    public List<Block> getBlocks() {
        return blocks;
    }

    public String getChampion() {
        return champion;
    }

    public String getMap() {
        return map;
    }

    public String getMode() {
        return mode;
    }

    public boolean isPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }
}
