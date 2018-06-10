package com.ikheiry.androidtp1;

import android.content.Intent;
import android.os.Bundle;
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

import java.util.ArrayList;

public class FilmActivity extends AppCompatActivity {

    private ArrayList<Fields> fields;
    private ListView listView;
    private FieldAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Développeur: Ismail KHEIRY", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // code ListView
        fields = InitList.getListFields();
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
    }

}
