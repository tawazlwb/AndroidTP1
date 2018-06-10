package com.ikheiry.androidtp1.webservice;

import com.ikheiry.androidtp1.R;
import com.ikheiry.androidtp1.metier.Fields;

import java.util.ArrayList;

/**
 * Created by ikheiry on 10/06/2018.
 */

public class InitList {
    public static ArrayList<Fields> getListFields(){
        ArrayList<Fields> fields = new ArrayList<>();
        fields.add(new Fields("Chris Columbus","Harry Potter à l'école des sorciers", R.drawable.harry));
        fields.add(new Fields("Chris Columbus","Harry Potter et la chambre des sevets", R.drawable.harry));
        fields.add(new Fields("Shaine Gabel","Love Song", R.drawable.love_song));
        fields.add(new Fields("Robert Zemckis","Forrest Gump", R.drawable.forrest_gump));
        fields.add(new Fields("Quentin Tarantino","Django Unchained", R.drawable.django_unchained));
        fields.add(new Fields("Frank Darabont","Les Evadés", R.drawable.les_evades));

        return fields;
    }
}
