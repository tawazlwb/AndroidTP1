package com.ikheiry.androidtp1.webservice;

import javax.net.ssl.HttpsURLConnection;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by ikheiry on 10/06/2018.
 */

public class OutilHttpClient {

    public static String getHttp(String url) throws Exception {

        // instaciation d'un client okHttpClient
        OkHttpClient client = new OkHttpClient();

        // creation d'une requete GET
        Request request = new Request.Builder()
                .url(url)
                .build();

        // execution de la requete
        Response response = client.newCall(request).execute();
        if(response.code() != HttpsURLConnection.HTTP_OK){
            throw new Exception("Reponse du serveur incorrecte " + response.code());
        }
        else {
            return response.body().string();
        }
    }
}
