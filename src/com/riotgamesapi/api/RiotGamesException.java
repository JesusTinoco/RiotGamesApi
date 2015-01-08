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

package com.riotgamesapi.api;

public class RiotGamesException extends RuntimeException{


    public RiotGamesException(){}

    public RiotGamesException(int errorCode){
        super(getMessage(errorCode));
    }

    public static String getMessage(int errorCode){
        String message;

        switch (errorCode){
            case 400:
                message = "Bad Request.";
                break;
            case 401:
                message = "Unauthorized.";
                break;
            case 403:
                message = "Forbidden.";
                break;
            case 404:
                message = "Not Found. The server has not found a match for the API request.";
                break;
            case 429:
                message = "Rate Limit Exceeded.";
                break;
            case 500:
                message = "Internal Server Error.";
                break;
            case 503:
                message = "Service Unavailable.";
                break;
            default:
                message = "Unknown.";
        }

        return message;
    }

}
