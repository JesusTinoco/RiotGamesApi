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

import java.util.Set;

/**
 * @version 1.4
 */
public class RunePage {

    private boolean current;
    private long id;
    private String name;
    private Set<RuneSlot> slots;

    /**
     *
     * @return Indicates if the page is the current page.
     */
    public boolean isCurrent() {
        return current;
    }

    /**
     *
     * @return Rune page ID.
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @return Rune page name.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return Collection of rune slots associated with the rune page.
     */
    public Set<RuneSlot> getSlots() {
        return slots;
    }
}
