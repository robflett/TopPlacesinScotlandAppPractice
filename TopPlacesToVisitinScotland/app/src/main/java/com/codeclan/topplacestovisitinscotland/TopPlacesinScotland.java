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
        place.add(new Places(2, "Forteviot", "Perthshire"));
        place.add(new Places(3, "Sands of Morar", "West Coast"));
        place.add(new Places(4, "Tobermory", "Mull"));
        place.add(new Places(5, "Skye", "Western Isles"));
        place.add(new Places(6, "The wee green van", "Portobello Beach"));
        place.add(new Places(7, "Callander", "Stirlingshire"));
        place.add(new Places(8, "North Berwick", "East Lothian"));
        place.add(new Places(9, "Anstruther", "Fife"));
        place.add(new Places(10, "Wick", "Sutherland"));
        place.add(new Places(11, "Cairngorms National Park", "Cairngorms"));
        place.add(new Places(12, "Linlithgow Palace", "Linlithgow"));
        place.add(new Places(13, "The Peat Road", "Sutherland"));
        place.add(new Places(14, "St Andrews", "East Coast"));
        place.add(new Places(15, "Arthurs Seat", "Edinburgh"));
        place.add(new Places(16, "Loch Vennacher", "Stirlingshire"));
        place.add(new Places(17, "Thornhill", "Stirlingshire"));
        place.add(new Places(18, "Mallaig", "West Coast"));
        place.add(new Places(19, "Leith Shore", "Edinburgh"));
        place.add(new Places(20, "Coldstream Beach", "East Coast"));


    }

    public ArrayList<Places> getList(){ return new ArrayList<Places>(place);}
}
