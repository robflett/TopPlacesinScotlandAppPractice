package com.codeclan.topplacestovisitinscotland;

import java.util.ArrayList;

/**
 * Created by user on 15/03/2017.
 */

public class TopPlacesinScotland {

    private ArrayList<Places> place;


    public TopPlacesinScotland()
    {
        place = new ArrayList<Places>();
        place.add(new Places(1, "Melvich Bay", "Sutherland"));
        place.add(new Places(2, "", "Sutherland"));
        place.add(new Places(3, "Melvich Bay", "Sutherland"));
        place.add(new Places(4, "Melvich Bay", "Sutherland"));
        place.add(new Places(5, "Melvich Bay", "Sutherland"));
        place.add(new Places(6, "Melvich Bay", "Sutherland"));
        place.add(new Places(7, "Melvich Bay", "Sutherland"));
        place.add(new Places(8, "Melvich Bay", "Sutherland"));
        place.add(new Places(9, "Melvich Bay", "Sutherland"));
        place.add(new Places(10, "Melvich Bay", "Sutherland"));
        place.add(new Places(11, "Melvich Bay", "Sutherland"));
        place.add(new Places(12, "Melvich Bay", "Sutherland"));
        place.add(new Places(13, "Melvich Bay", "Sutherland"));
        place.add(new Places(14, "Melvich Bay", "Sutherland"));
        place.add(new Places(15, "Melvich Bay", "Sutherland"));
        place.add(new Places(16, "Melvich Bay", "Sutherland"));
        place.add(new Places(17, "Melvich Bay", "Sutherland"));
        place.add(new Places(18, "Melvich Bay", "Sutherland"));
        place.add(new Places(19, "Melvich Bay", "Sutherland"));
        place.add(new Places(20, "Melvich Bay", "Sutherland"));


    }

    public ArrayList<Places> getList(){ return new ArrayList<Places>(place);}
}
