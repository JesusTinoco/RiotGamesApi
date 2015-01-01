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

public enum Region {

    BR("br.com.riotgamesapi.api.pvp.net", "br"),
    EUNE("eune.com.riotgamesapi.api.pvp.net", "eune"),
    EUW("euw.com.riotgamesapi.api.pvp.net", "euw"),
    KR("kr.com.riotgamesapi.api.pvp.net", "kr"),
    LAS("las.com.riotgamesapi.api.pvp.net", "las"),
    LAN("lan.com.riotgamesapi.api.pvp.net", "lan"),
    NA("na.com.riotgamesapi.api.pvp.net", "na"),
    OCE("oce.com.riotgamesapi.api.pvp.net", "oce"),
    TR("tr.com.riotgamesapi.api.pvp.net", "tr"),
    RU("ru.com.riotgamesapi.api.pvp.net", "ru"),
    GLOBAL("global.com.riotgamesapi.api.pvp.net", "global");

    private String endpoint;
    private String region;

    Region(String endpoint, String region){
        this.endpoint = endpoint;
        this.region = region;
    }

    public String getEndpoint(){
        return "https://" + endpoint;
    }

    public String getRegion(){
        return region;
    }

}
