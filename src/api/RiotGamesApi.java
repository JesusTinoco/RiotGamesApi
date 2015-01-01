package api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import dto.*;
import dto.champion.Champion;
import dto.champion.ChampionList;
import dto.game.RecentGames;
import dto.league.League;
import dto.match.MatchDetail;
import dto.matchHistory.PlayerHistory;
import dto.staticData.*;
import dto.stats.PlayerStatsSummaryList;
import dto.stats.RankedStats;
import dto.status.Shard;
import dto.status.ShardStatus;
import dto.summoner.MasteryPages;
import dto.summoner.RunePages;
import dto.summoner.Summoner;
import dto.team.MasteryData;
import dto.team.Team;

import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 */
public class RiotGamesApi {

    private final QueryManager api;

    private final Gson gson;

    public RiotGamesApi(){
        this.api = QueryManager.getInstance();

        this.gson = new Gson();
    }

    public RiotGamesApi(String apiKey){
        this.api = QueryManager.getInstance();
        api.setApiKey(apiKey);

        this.gson = new Gson();
    }

    public RiotGamesApi(String apiKey, Region region){
        this(apiKey);
        api.setRegion(region);
    }

    public void setApiKey(String apiKey){
        api.setApiKey(apiKey);
    }

    public void setRegion(Region region){
        api.setRegion(region);
    }

    /**
     *
     * @param freeToPlay (Optional) Filter param to retrieve only free to play champions.
     * @return Retrieve all champions.
     */
    public ChampionList getAllChampions(Boolean freeToPlay){
        String path = Version.CHAMPION.getVersionNumber() + "/" + Version.CHAMPION.getName();

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (freeToPlay != null) queryParameters.put("freeToPlay", freeToPlay.toString());

        Reader json = api.query(path, queryParameters);
        return gson.fromJson(json, ChampionList.class);
    }

    /**
     *
     * @param championId (Required) ID of the champion to retrieve.
     * @return Retrieve champion by ID.
     */
    public Champion getChampionById(Integer championId){
        String path = Version.CHAMPION.getVersionNumber() + "/" + Version.CHAMPION.getName() +
                "/" + championId;

        Reader json = api.query(path, null);
        return gson.fromJson(json, Champion.class);
    }

    /**
     *
     * @param summonerId (Required) ID of the summoner for which to retrieve recent games.
     * @return Recent games by summoner ID.
     */
    public RecentGames getRecentGames(long summonerId){
        String path = Version.GAME.getVersionNumber() + "/" + Version.GAME.getName() +
                "/by-summoner/" + summonerId + "/recent";

        Reader json = api.query(path, null);
        return gson.fromJson(json, RecentGames.class);
    }

    /**
     *
     * @param summonerIds (Required) Array of summoner IDs. Maximum allowed at once is 10.
     * @return Leagues mapped by summoner ID for a given list of summoner IDs.
     */
    public Map<String, List<League>> getLeagueBySummonerIds(Long... summonerIds){
        String path = Version.LEAGUE.getVersionNumber() + "/" + Version.LEAGUE.getName() +
                "/by-summoner/" + Util.ObjectToString(summonerIds);

        Reader json = api.query(path, null);
        Type type = new TypeToken<Map<String, List<League>>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @param summonerIds (Required) Array of summoner IDs. Maximum allowed at once is 10.
     * @return Leagues entries mapped by summoner ID for a given list of summoner IDs.
     */
    public Map<String, List<League>> getLeagueEntryBySummonerIds(Long... summonerIds){
        String path = Version.LEAGUE.getVersionNumber() + "/" + Version.LEAGUE.getName() +
                "/by-summoner/" + Util.ObjectToString(summonerIds) + "/entry";

        Reader json = api.query(path, null);
        Type type = new TypeToken<Map<String, List<League>>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @param teamIds (Required) Array of team IDs. Maximum allowed at once is 10.
     * @return All leagues for specified teams.
     */
    public Map<String, List<League>> getLeagueByTeamIds(Long... teamIds){
        String path = Version.LEAGUE.getVersionNumber() + "/" + Version.LEAGUE.getName() +
                "/by-team/" + Util.ObjectToString(teamIds);

        Reader json = api.query(path, null);
        Type type = new TypeToken<Map<String, List<League>>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @param teamIds (Required) Array of team IDs. Maximum allowed at once is 10.
     * @return Returns all league entries for specified teams.
     */
    public Map<String, List<League>> getLeagueEntryByTeamIds(Long... teamIds){
        String path = Version.LEAGUE.getVersionNumber() + "/" + Version.LEAGUE.getName() +
                "/by-team/" + Util.ObjectToString(teamIds) + "/entry";

        Reader json = api.query(path, null);
        Type type = new TypeToken<Map<String, List<League>>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @param queueType (Required) Game queue type.
     * @return Challenger tier leagues.
     */
    public League getChallengerLeague(QueueType queueType){
        String path = Version.LEAGUE.getVersionNumber() + "/" + Version.LEAGUE.getName() +
                "/challenger";

        Map<String, String> queryParameters = new HashMap<String, String>();
        queryParameters.put("type", queueType.toString());

        Reader json = api.query(path, queryParameters);
        return gson.fromJson(json, League.class);
    }

    /**
     *
     * @param locale (Optional) Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale for the region is used.
     * @param version (Optional) Data dragon version for returned data. If not specified, the latest version for the region is used. List of valid versions can be obtained from the /versions endpoint.
     * @param dataById (Optional) If specified as true, the returned data map will use the champions' IDs as the keys. If not specified or specified as false, the returned data map will use the champions' keys instead.
     * @param champData (Optional) Tags to return additional data. Only type, version, data, id, key, name, and title are returned by default if this parameter isn't specified. To return all additional data, use the tag 'all'.
     * @return ChampionList
     */
    public dto.staticData.ChampionList getAllChampions(String locale, String version, Boolean dataById, ChampData[] champData){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/champion";

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (locale != null) queryParameters.put("locale", locale);
        if (version != null) queryParameters.put("version", version);
        if (dataById != null) queryParameters.put("dataById", dataById.toString());
        if (champData != null) queryParameters.put("champData", Util.ObjectToString(champData));

        Reader json = api.staticQuery(path, queryParameters);
        return gson.fromJson(json, dto.staticData.ChampionList.class);
    }

    /**
     *
     * @param id (Required) Champion ID
     * @param locale (Optional) Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale for the region is used.
     * @param version (Optional) Data dragon version for returned data. If not specified, the latest version for the region is used. List of valid versions can be obtained from the /versions endpoint.
     * @param champData (Optional) Tags to return additional data. Only id, key, name, and title are returned by default if this parameter isn't specified. To return all additional data, use the tag 'all'.
     * @return Champion by its id
     */
    public dto.staticData.Champion getChampionById(int id, String locale, String version, ChampData champData){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/champion/" + id;

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (locale != null) queryParameters.put("locale", locale);
        if (version != null) queryParameters.put("version", version);
        if (champData != null) queryParameters.put("champData", Util.ObjectToString(champData));

        Reader json = api.staticQuery(path, queryParameters);
        return gson.fromJson(json, dto.staticData.Champion.class);
    }

    /**
     *
     * @param locale (Optional) Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale for the region is used.
     * @param version (Optional) Data dragon version for returned data. If not specified, the latest version for the region is used. List of valid versions can be obtained from the /versions endpoint.
     * @param itemListData (Optional) Tags to return additional data. Only type, version, basic, data, id, name, plaintext, group, and description are returned by default if this parameter isn't specified. To return all additional data, use the tag 'all'.
     * @return ItemList
     */
    public ItemList getItemList(String locale, String version, ItemListData itemListData){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/item";

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (locale != null) queryParameters.put("locale", locale);
        if (version != null) queryParameters.put("version", version);
        if (itemListData != null) queryParameters.put("itemListData", Util.ObjectToString(itemListData));

        Reader json = api.staticQuery(path, queryParameters);
        return gson.fromJson(json, ItemList.class);
    }

    /**
     *
     * @param id (Required) Item ID
     * @param locale (Optional) Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale for the region is used.
     * @param version (Optional) Data dragon version for returned data. If not specified, the latest version for the region is used. List of valid versions can be obtained from the /versions endpoint.
     * @param itemData (Optional) Tags to return additional data. Only id, name, plaintext, group, and description are returned by default if this parameter isn't specified. To return all additional data, use the tag 'all'.
     * @return Item by its unique id.
     */
    public Item getItemById(int id, String locale, String version, ItemData itemData){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/item" + id;

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (locale != null) queryParameters.put("locale", locale);
        if (version != null) queryParameters.put("version", version);
        if (itemData != null) queryParameters.put("itemData", Util.ObjectToString(itemData));

        Reader json = api.staticQuery(path, queryParameters);
        return gson.fromJson(json, Item.class);
    }

    /**
     *
     * @return Version data
     */
    public List<String> getDataVersion(){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/languages";

        Reader json = api.staticQuery(path, null);
        Type type = new TypeToken<List<String>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @param locale (Optional) Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale for the region is used.
     * @param version (Optional) Data dragon version for returned data. If not specified, the latest version for the region is used. List of valid versions can be obtained from the /versions endpoint.
     * @param masteryListData (Optional) Tags to return additional data. Only type, version, data, id, name, and description are returned by default if this parameter isn't specified. To return all additional data, use the tag 'all'.
     * @return MasteryList
     */
    public MasteryList getMasteryList(String locale, String version, MasteryListData masteryListData){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/mastery";

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (locale != null) queryParameters.put("locale", locale);
        if (version != null) queryParameters.put("version", version);
        if (masteryListData != null) queryParameters.put("masteryListData", Util.ObjectToString(masteryListData));

        Reader json = api.staticQuery(path, queryParameters);
        return gson.fromJson(json, MasteryList.class);
    }

    /**
     *
     * @param id (Required) Mastery ID
     * @param locale (Optional) Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale for the region is used.
     * @param version (Optional) Data dragon version for returned data. If not specified, the latest version for the region is used. List of valid versions can be obtained from the /versions endpoint.
     * @param masteryData (Optional) Tags to return additional data. Only id, name, and description are returned by default if this parameter isn't specified. To return all additional data, use the tag 'all'.
     * @return Mastery item by its unique id.
     */
    public Mastery getMasteryById(int id, String locale, String version, MasteryData masteryData){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/mastery/" + id;

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (locale != null) queryParameters.put("locale", locale);
        if (version != null) queryParameters.put("version", version);
        if (masteryData != null) queryParameters.put("masteryData", Util.ObjectToString(masteryData));

        Reader json = api.staticQuery(path, queryParameters);
        return gson.fromJson(json, Mastery.class);
    }

    /**
     *
     * @return Realm data
     */
    public Realm getRealmData(){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/realm";

        Reader json = api.staticQuery(path, null);
        return gson.fromJson(json, Realm.class);
    }

    /**
     *
     * @param locale (Optional) Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale for the region is used.
     * @param version (Optional) Data dragon version for returned data. If not specified, the latest version for the region is used. List of valid versions can be obtained from the /versions endpoint.
     * @param runeListData (Optional) Tags to return additional data. Only type, version, data, id, name, rune, and description are returned by default if this parameter isn't specified. To return all additional data, use the tag 'all'.
     * @return Rune list.
     */
    public RuneList getRuneList(String locale, String version, RuneListData runeListData){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/rune";

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (locale != null) queryParameters.put("locale", locale);
        if (version != null) queryParameters.put("version", version);
        if (runeListData != null) queryParameters.put("runeListData", Util.ObjectToString(runeListData));

        Reader json = api.staticQuery(path, queryParameters);
        return gson.fromJson(json, RuneList.class);
    }

    /**
     *
     * @param id (Required) Rune ID.
     * @param locale (Optional) Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale for the region is used.
     * @param version (Optional) Data dragon version for returned data. If not specified, the latest version for the region is used. List of valid versions can be obtained from the /versions endpoint.
     * @param runeData (Optional) Tags to return additional data. Only id, name, rune, and description are returned by default if this parameter isn't specified. To return all additional data, use the tag 'all'.
     * @return Rune by its unique id.
     */
    public Rune getRuneById(int id, String locale, String version, RuneData runeData){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/rune/" + id;

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (locale != null) queryParameters.put("locale", locale);
        if (version != null) queryParameters.put("version", version);
        if (runeData != null) queryParameters.put("runeData", Util.ObjectToString(runeData));

        Reader json = api.staticQuery(path, queryParameters);
        return gson.fromJson(json, Rune.class);
    }

    /**
     *
     * @param locale (Optional) Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale for the region is used.
     * @param version (Optional) Data dragon version for returned data. If not specified, the latest version for the region is used. List of valid versions can be obtained from the /versions endpoint.
     * @param dataById (Optional) If specified as true, the returned data map will use the spells' IDs as the keys. If not specified or specified as false, the returned data map will use the spells' keys instead.
     * @param spellData (Optional) Tags to return additional data. Only type, version, data, id, key, name, description, and summonerLevel are returned by default if this parameter isn't specified. To return all additional data, use the tag 'all'.
     * @return Summoner spell list.
     */
    public SummonerSpellList getSummonerSpellList(String locale, String version, Boolean dataById, SpellData spellData){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/summoner-spell";

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (locale != null) queryParameters.put("locale", locale);
        if (version != null) queryParameters.put("version", version);
        if (dataById != null) queryParameters.put("dataById", dataById.toString());
        if (spellData != null) queryParameters.put("spellData", Util.ObjectToString(spellData));

        Reader json = api.staticQuery(path, queryParameters);
        return gson.fromJson(json, SummonerSpellList.class);
    }

    /**
     *
     * @param id (Required) Summoner spell ID.
     * @param locale (Optional) Locale code for returned data (e.g., en_US, es_ES). If not specified, the default locale for the region is used.
     * @param version (Optional) Data dragon version for returned data. If not specified, the latest version for the region is used. List of valid versions can be obtained from the /versions endpoint.
     * @param spellData (Optional) Tags to return additional data. Only type, version, data, id, key, name, description, and summonerLevel are returned by default if this parameter isn't specified. To return all additional data, use the tag 'all'.
     * @return Summoner spell by its unique id.
     */
    public SummonerSpell getSummonerSpellById(int id, String locale, String version, SpellData spellData){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/summoner-spell/" + id;

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (locale != null) queryParameters.put("locale", locale);
        if (version != null) queryParameters.put("version", version);
        if (spellData != null) queryParameters.put("spellData", Util.ObjectToString(spellData));

        Reader json = api.staticQuery(path, queryParameters);
        return gson.fromJson(json, SummonerSpell.class);
    }

    /**
     *
     * @return Version Data.
     */
    public List<String> getVersionData(){
        String path = Version.LOL_STATIC_DATA.getVersionNumber() + "/versions";

        Reader json = api.staticQuery(path, null);
        Type type = new TypeToken<List<String>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @return Shard list;
     */
    public List<Shard> getShards(){
        String path = "/shards";

        Reader json = api.query(path, null);
        Type type = new TypeToken<List<Shard>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @return ServerStatus
     */
    public ShardStatus getServerStatus(){
        String path = "/shards/";

        Reader json = api.statusQuery(path);
        return gson.fromJson(json, ShardStatus.class);
    }

    /**
     *
     * @param matchId (Required) The ID of the match.
     * @param includeTimeline (Optional) Flag indicating whether or not to include match timeline data
     * @return Match details;
     */
    public MatchDetail getMatchDetailById(long matchId, Boolean includeTimeline){
        String path = Version.MATCH.getVersionNumber() + "/" + Version.MATCH.getName() +
                "/" + matchId;

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (includeTimeline != null) queryParameters.put("includeTimeline", includeTimeline.toString());

        Reader json = api.query(path, queryParameters);
        return gson.fromJson(json, MatchDetail.class);
    }

    /**
     *
     * @param summonerId (Required) The ID of the summoner.
     * @param queueType (Optional) Array of champion IDs to use for fetching games.
     * @param beginIndex (Optional) Array of ranked queue types to use for fetching games.
     * @param endIndex (Optional) The begin index to use for fetching games.
     * @param championIds (Optional) The end index to use for fetching games.
     * @return Match history
     */
    public PlayerHistory getPlayerHistoryBySummonerId(long summonerId, Long[] championIds, QueueType[] queueType, Integer beginIndex, Integer endIndex){
        String path = Version.MATCH_HISTORY.getVersionNumber() + "/" + Version.MATCH_HISTORY.getName() +
                "/" + summonerId;

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (championIds != null) queryParameters.put("championIds", Util.ObjectToString(championIds));
        if (queueType != null) queryParameters.put("queueType", Util.ObjectToString(queueType));
        if (beginIndex != null) queryParameters.put("beginIndex", beginIndex.toString());
        if (endIndex != null) queryParameters.put("endIndex", endIndex.toString());

        Reader json = api.query(path, queryParameters);
        return gson.fromJson(json, PlayerHistory.class);
    }

    /**
     *
     * @param summonerId (Required) ID of the summoner for which to retrieve ranked stats.
     * @param season (Optional) If specified, stats for the given season are returned. Otherwise, stats for the current season are returned.
     * @return Ranked stats by summoner ID.
     */
    public RankedStats getRankedStatsBySummonerId(int summonerId, Season season){
        String path = Version.STATS.getVersionNumber() + "/" + Version.STATS.getName() +
                "/by-summoner/" + summonerId + "/ranked";

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (season != null) queryParameters.put("season", season.toString());

        Reader json = api.query(path, queryParameters);
        return gson.fromJson(json, RankedStats.class);
    }

    /**
     *
     * @param summonerId (Required) ID of the summoner for which to retrieve ranked stats.
     * @param season (Optional) If specified, stats for the given season are returned. Otherwise, stats for the current season are returned.
     * @return Player stats summaries by summoner ID.
     */
    public PlayerStatsSummaryList getPlayerStatsSummariesBySummonerId(int summonerId, Season season){
        String path = Version.STATS.getVersionNumber() + "/" + Version.STATS.getName() +
                "/by-summoner/" + summonerId + "/summary";

        Map<String, String> queryParameters = new HashMap<String, String>();
        if (season != null) queryParameters.put("season", season.toString());

        Reader json = api.query(path, queryParameters);
        return gson.fromJson(json, PlayerStatsSummaryList.class);
    }

    /**
     *
     * @param summonerNames (Required) Summoner names or standardized summoner names associated with summoners to retrieve. Maximum allowed at once is 40.
     * @return Summoner objects mapped by standardized summoner name for a given list of summoner names.
     */
    public Map<String,Summoner> getSummonerByName(String... summonerNames){
        String path = Version.SUMMONER.getVersionNumber() + "/" + Version.SUMMONER.getName() +
                "/by-name/" + Util.ObjectToString(summonerNames);

        Reader json = api.query(path, null);
        Type type = new TypeToken<Map<String, Summoner>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @param summonerIds (Required) Summoner IDs associated with summoners to retrieve. Maximum allowed at once is 40.
     * @return Summoner objects mapped by summoner ID for a given list of summoner IDs.
     */
    public Map<String, Summoner> getSummonerById(Integer... summonerIds){
        String path = Version.SUMMONER.getVersionNumber() + "/" + Version.SUMMONER.getName() +
                "/" + Util.ObjectToString(summonerIds);

        Reader json = api.query(path, null);
        Type type = new TypeToken<Map<String, Summoner>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @param summonerIds (Required) Summoner IDs associated with masteries to retrieve. Maximum allowed at once is 40.
     * @return Mastery pages mapped by summoner ID for a given list of summoner IDs
     */
    public Map<String, MasteryPages> getMasteryPagesBySummonerIds(Integer... summonerIds){
        String path = Version.SUMMONER.getVersionNumber() + "/" + Version.SUMMONER.getName() +
                "/" + Util.ObjectToString(summonerIds) + "/masteries";

        Reader json = api.query(path, null);
        Type type = new TypeToken<Map<String, MasteryPages>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @param summonerIds (Required) Summoner IDs associated with masteries to retrieve. Maximum allowed at once is 40.
     * @return Summoner names mapped by summoner ID for a given list of summoner IDs.
     */
    public Map<String, String> getSummonerNamesBySummonerIds(Integer... summonerIds){
        String path = Version.SUMMONER.getVersionNumber() + "/" + Version.SUMMONER.getName() +
                "/" + Util.ObjectToString(summonerIds) + "/name";

        Reader json = api.query(path, null);
        Type type = new TypeToken<Map<String, String>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @param summonerIds (Required) Summoner IDs associated with masteries to retrieve. Maximum allowed at once is 40.
     * @return Rune pages mapped by summoner ID for a given list of summoner IDs
     */
    public Map<String, RunePages> getRunePagesBySummonerIds(Integer... summonerIds){
        String path = Version.SUMMONER.getVersionNumber() + "/" + Version.SUMMONER.getName() +
                "/" + Util.ObjectToString(summonerIds) + "/runes";

        Reader json = api.query(path, null);
        Type type = new TypeToken<Map<String, RunePages>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @param summonerIds (Required) Summoner IDs. Maximum allowed at once is 10.
     * @return Teams mapped by summoner ID for a given list of summoner IDs.
     */
    public Map<String, List<Team>> getTeamsBySummonerIds(Integer... summonerIds){
        String path = Version.TEAM.getVersionNumber() + "/" + Version.TEAM.getName() +
                "/by-summoner/" + Util.ObjectToString(summonerIds);

        Reader json = api.query(path, null);
        Type type = new TypeToken<Map<String, List<Team>>>() {}.getType();
        return gson.fromJson(json, type);
    }

    /**
     *
     * @param teamIds (Required) Summoner IDs. Maximum allowed at once is 10.
     * @return Teams mapped by team ID for a given list of team IDs.
     */
    public Map<String, Team> getTeamsByIds(Integer... teamIds){
        String path = Version.TEAM.getVersionNumber() + "/" + Version.TEAM.getName() +
                "/" + Util.ObjectToString(teamIds);

        Reader json = api.query(path, null);
        Type type = new TypeToken<Map<String, Team>>() {}.getType();
        return gson.fromJson(json, type);
    }

}
