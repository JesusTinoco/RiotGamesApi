package dto;

/**
 * Created by Desarrollo on 29/12/14.
 */
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
