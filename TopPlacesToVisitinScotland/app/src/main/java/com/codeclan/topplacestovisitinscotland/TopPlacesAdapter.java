package com.codeclan.topplacestovisitinscotland;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;



public class TopPlacesAdapter extends ArrayAdapter<Places> {

    public TopPlacesAdapter(Context context, ArrayList<Places> places){

        super(context, 0, places);

    }

    @Override
    public View getView(int position, View listPlacesView, ViewGroup parent){

        if (listPlacesView == null) {

            listPlacesView = LayoutInflater.from(getContext()).inflate(R.layout.places_items, parent, false);

        }

        Places aplace = getItem(position);

        TextView ranking = (TextView) listPlacesView.findViewById(R.id.ranking);
        ranking.setText(aplace.getRanking().toString() );

//        .toString()`

        TextView title = (TextView) listPlacesView.findViewById(R.id.placename);
        title.setText(aplace.getPlacename() );

        TextView year = (TextView) listPlacesView.findViewById(R.id.location);
        year.setText(aplace.getLocation().toString() );


        return listPlacesView;

    }
}
