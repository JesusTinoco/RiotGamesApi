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

package com.riotgamesapi.dto.summoner;

/**
 * @version 1.4
 */
public class RuneSlot {

    private int runeId;
    private int runeSlotId;

    /**
     *
     * @return Rune ID associated with the rune slot. For static information correlating to rune IDs, please refer to the LoL Static Data API.
     */
    public int getRuneSlotId() {
        return runeSlotId;
    }

    /**
     *
     * @return Rune slot ID.
     */
    public int getRuneId() {
        return runeId;
    }
}
