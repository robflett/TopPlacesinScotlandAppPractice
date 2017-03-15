package com.codeclan.topplacestovisitinscotland;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopPlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        TopPlacesinScotland topPlaces = new TopPlacesinScotland();
        ArrayList<Places> listofplaces = topPlaces.getList();

        TopPlacesAdapter placesAdapter = new TopPlacesAdapter(this, listofplaces);

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(placesAdapter);
    }
}
