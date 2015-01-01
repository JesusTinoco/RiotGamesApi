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

import java.util.List;

/**
 * @version 1.4
 */
public class MasteryPage {

    private boolean current;
    private long id;
    private List<Mastery> masteries;
    private String name;

    /**
     *
     * @return Indicates if the mastery page is the current mastery page.
     */
    public boolean isCurrent() {
        return current;
    }

    /**
     *
     * @return Mastery page ID.
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @return Collection of masteries associated with the mastery page.
     */
    public List<Mastery> getMasteries() {
        return masteries;
    }

    /**
     *
     * @return Mastery page name.
     */
    public String getName() {
        return name;
    }
}
