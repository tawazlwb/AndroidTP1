package com.ikheiry.androidtp1.webservice;

import android.util.Log;

import com.google.gson.Gson;
import com.ikheiry.androidtp1.R;
import com.ikheiry.androidtp1.metier.Fields;
import com.ikheiry.androidtp1.metier.Record;
import com.ikheiry.androidtp1.metier.ResultSet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ikheiry on 10/06/2018.
 */

public class InitList {

    private static final String URL_WS = "https://opendata.paris.fr/api/records/1.0/search/?dataset=tournagesdefilmsparis2011&facet=realisateur&facet=organisme_demandeur&facet=type_de_tournage&facet=ardt";

    public static ArrayList<Fields> getListFields() {
        ArrayList<Fields> fields = new ArrayList<>();
        fields.add(new Fields("Chris Columbus", "Harry Potter à l'école des sorciers", R.drawable.harry));
        fields.add(new Fields("Chris Columbus", "Harry Potter et la chambre des sevets", R.drawable.harry));
        fields.add(new Fields("Shaine Gabel", "Love Song", R.drawable.love_song));
        fields.add(new Fields("Robert Zemckis", "Forrest Gump", R.drawable.forrest_gump));
        fields.add(new Fields("Quentin Tarantino", "Django Unchained", R.drawable.django_unchained));
        fields.add(new Fields("Frank Darabont", "Les Evadés", R.drawable.les_evades));

        return fields;
    }

    public static List<Fields> getFieldWS() throws Exception {
        Log.v("URl", URL_WS);

        // recupération des données via OkHttp
        String reponse = OutilHttpClient.getHttp("https://opendata.paris.fr/api/records/1.0/search/?dataset=tournagesdefilmsparis2011&facet=realisateur&facet=organisme_demandeur&facet=type_de_tournage&facet=ardt");

        // creation de l'instance Gson
        Gson gson = new Gson();

        // appel de la fonction fromJson
        ResultSet resultat = gson.fromJson(reponse, ResultSet.class);

        // recuperation de la liste
        List<Fields> fields = new ArrayList<>();
        if (resultat == null) {
            throw new Exception("Resultat null");
        } else {
            for (Record record : resultat.getRecords()) {
                fields.add(record.getFields());
            }
            return fields;
        }
    }
}
