package com.codeclan.topplacestovisitinscotland;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

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


//    public void placeClicked(View textView){
//        TextView title = (TextView) textView;
//        Log.d("Place clicked", place.getText().toString() );
//
//    }

    public void itemClicked(View item) {
        Log.d("Item clicked ", "It would be nice for this to go to Wikipedia or something...");

    }
}
