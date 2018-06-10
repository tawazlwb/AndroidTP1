package com.ikheiry.androidtp1;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ikheiry.androidtp1.metier.FieldAdapter;
import com.ikheiry.androidtp1.metier.Fields;
import com.ikheiry.androidtp1.webservice.InitList;
import com.ikheiry.androidtp1.webservice.OutilHttpClient;

import java.util.ArrayList;
import java.util.List;

public class FilmActivity extends AppCompatActivity {

    private ArrayList<Fields> fields;
    private ListView listView;
    private FieldAdapter adapter;
    private CoordinatorLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rootLayout = findViewById(R.id.rootLayout);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Développeur: Ismail KHEIRY", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // code ListView
        //fields = InitList.getListFields();
        fields = new ArrayList<>();
        listView = findViewById(R.id.list_film);
        adapter = new FieldAdapter(this, fields);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("Form", "Position " + i);
                Fields field = fields.get(i);

                Intent intent = new Intent(FilmActivity.this, InfoActivity.class);
                intent.putExtra("key", field);
                startActivity(intent);
            }
        });


        // AsynchTask : appel du service opendata
        MonAsyncTask monAsyncTask = new MonAsyncTask();
        monAsyncTask.execute();
    }

    public class MonAsyncTask extends AsyncTask {

        List<Fields> resultat;

        @Override
        protected Object doInBackground(Object[] objects) {
            try {
                //text = OutilHttpClient.getHttp("https://opendata.paris.fr/api/records/1.0/search/?dataset=tournagesdefilmsparis2011&facet=realisateur&facet=organisme_demandeur&facet=type_de_tournage&facet=ardt");
                resultat = InitList.getFieldWS();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);

            //Log.i("Resultat requete HTTP :", text);
            fields.clear();
            fields.addAll(resultat);
            adapter.updateData();

            //Mise a jour de TextView
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    //result.setText(text);
                    Snackbar.make(rootLayout, "AsynchTask : OK 200", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
    }

}
