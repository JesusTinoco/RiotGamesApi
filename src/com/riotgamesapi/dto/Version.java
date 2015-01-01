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

package com.riotgamesapi.dto;

public enum Version {

    CHAMPION("champion", "v1.2"),
    GAME("game", "v1.3"),
    LEAGUE("league", "v2.5"),
    LOL_STATIC_DATA("lol-static-data", "v1.2"),
    LOL_STATUS("shards", "v1.0"),
    MATCH("match", "v2.2"),
    MATCH_HISTORY("matchhistory", "v2.2"),
    STATS("stats", "v1.3"),
    SUMMONER("summoner", "v1.4"),
    TEAM("team", "v2.4");

    private String name;
    private String versionNumber;

    Version(String name, String versionNumber){
        this.name = name;
        this.versionNumber = versionNumber;
    }

    public String getName(){
        return name;
    }

    public String getVersionNumber(){
        return versionNumber;
    }

}
