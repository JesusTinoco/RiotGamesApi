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
