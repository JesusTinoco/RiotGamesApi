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
