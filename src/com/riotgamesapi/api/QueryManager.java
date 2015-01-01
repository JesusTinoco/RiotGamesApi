package com.riotgamesapi.api;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.riotgamesapi.dto.Region;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;

public class QueryManager {

    private static QueryManager INSTANCE = null;

    private final OkHttpClient client;

    private String apiKey;
    private Region region;

    private QueryManager(){
        client = new OkHttpClient();

        region = Region.EUW;
    }

    public void setApiKey(String apiKey){
        this.apiKey = apiKey;
    }

    public void setRegion(Region region){
        this.region = region;
    }

    public static QueryManager getInstance(){
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }

    private static void createInstance(){
        if (INSTANCE == null) {
            synchronized (QueryManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new QueryManager();
                }
            }
        }
    }

    public Reader query(String path, Map<String, String> queryParameters){
        String url = region.getEndpoint() + "/com/riotgamesapi/api/lol/" + region.getRegion() + "/" + path +
                "?api_key=" + apiKey + getParameters(queryParameters);

        System.out.println(url);

        Request request = new Request.Builder()
                .url(url)
                .build();
        return execute(request);
    }

    public Reader staticQuery(String path, Map<String, String> queryParameters){
        String url = region.getEndpoint() + "/com/riotgamesapi/api/lol/static-data/" + region.getRegion() +
                "/" + path + "?api_key=" + apiKey + getParameters(queryParameters);

        Request request = new Request.Builder()
                .url(url)
                .build();
        return execute(request);
    }

    public Reader shardsQuery(String path){
        String url = "http://status.leagueoflegends.com" + path;
        Request request = new Request.Builder()
                .url(url)
                .build();
        return execute(request);
    }

    public Reader statusQuery(String path){
        String url = "http://status.leagueoflegends.com" + path + "/" + region.getRegion();
        Request request = new Request.Builder()
                .url(url)
                .build();
        return execute(request);
    }

    public String getParameters(Map<String, String> queryParameters){
        String res = "";
        if (queryParameters != null && queryParameters.keySet().size() > 0){
            for(String param: queryParameters.keySet()){
                res += "&" + param + "=" + queryParameters.get(param);
            }
        }
        return res;
    }

    public Reader execute(Request request){
        Response response = null;

        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            throw new RiotGamesException(0);
        }

        int code = response.code();
        if (!response.isSuccessful()) throw new RiotGamesException(code);

        return response.body().charStream();
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
