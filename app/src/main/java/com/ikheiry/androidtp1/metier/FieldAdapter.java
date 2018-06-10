package com.ikheiry.androidtp1.metier;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ikheiry.androidtp1.R;

import java.util.ArrayList;

/**
 * Created by ikheiry on 09/06/2018.
 */

public class FieldAdapter extends ArrayAdapter<Fields> {
    public FieldAdapter(@NonNull Context context, ArrayList<Fields> listFields) {
        super(context, 0, listFields);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View result = convertView;
        if(convertView == null){
            result =LayoutInflater.from(getContext()).inflate(R.layout.modele, parent, false);
        }

        Fields film = getItem(position);
        TextView titre = result.findViewById(R.id.titre);
        titre.setText(film.getTitre());

        TextView realisateur = result.findViewById(R.id.realisateur);
        realisateur.setText(film.getRealisateur());

        ImageView image = result.findViewById(R.id.fileImage);
        //image.setImageResource(film.getImageID());

        return result;
    }

    public void updateData(){
        this.notifyDataSetChanged();
    }
}
