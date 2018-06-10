package com.ikheiry.androidtp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ikheiry.androidtp1.metier.Fields;

public class InfoActivity extends AppCompatActivity {

    ImageView img;
    TextView titre;
    TextView realisateur;
    Fields field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        img = findViewById(R.id.filmImg);
        titre = findViewById(R.id.filmTitre);
        realisateur = findViewById(R.id.filmRealisateur);
        field = (Fields) getIntent().getExtras().getSerializable("key");
        img.setImageResource(field.getImageID());
        titre.setText(field.getTitre());
        realisateur.setText(field.getRealisateur());
    }
}
