package api;

public class Util {


    public static String ObjectToString(Object... params){
        String strSummonerIds = "";

        for (int i = 0; i <params.length; i++) {
            if(i != (params.length - 1)){
                strSummonerIds += params[i] + ",";
            } else {
                strSummonerIds += params[i];
            }
        }

        return strSummonerIds;
    }

}
