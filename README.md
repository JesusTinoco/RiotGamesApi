# Riot Games Api - A Java Riot Games API Wrapper

Riot Games Api is a Java wrapper for the [Riot's API](). A simple client to access League of Legends game data.

##Requirements

**Riot Games Api** requires the following libraries:
- [Google Gson](https://code.google.com/p/google-gson/)
- [Square OKHTTP](http://square.github.io/okhttp/)

##Usage

```
import api.RiotGamesApi;
import dto.Region;
import dto.summoner.Summoner;

import java.util.Map;

public class Example {

    public static void main(String[] args){

        RiotGamesApi api = new RiotGamesApi();
        api.setApiKey("<your-api-key>");
        api.setRegion(Region.EUW);

        Map<String, Summoner> summoner = api.getSummonerById(22073091);
        String name = summoner.get(22073091).getName();

        System.out.println(name);

    }

}
```

##API Versions

The current version of this library supports the following Riot Games API versions:
- **champion-v1.2 [BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, RU, TR]**
- **game-v1.3 [BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, RU, TR]**
- **league-v2.5 [BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, RU, TR]**
- **lol-static-data-v1.2 [BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, RU, TR]**
- **lol-status-v1.0 [BR, EUNE, EUW, LAN, LAS, NA, OCE, PBE, RU, TR]**
- **match-v2.2 [BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, PBE, RU, TR]**
- **matchhistory-v2.2 [BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, PBE, RU, TR]**
- **stats-v1.3 [BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, RU, TR]**
- **summoner-v1.4 [BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, RU, TR]**
- **team-v2.4 [BR, EUNE, EUW, KR, LAN, LAS, NA, OCE, RU, TR]**

##Download


##Questions/Contributions
To contact me via email [jesrodtin@alum.us.es](mailto:jesrodtin@alum.us.es).
Feel free to send pull requests if you would like to contribute to this repo.
