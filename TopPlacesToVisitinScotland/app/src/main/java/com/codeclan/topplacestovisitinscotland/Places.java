package com.codeclan.topplacestovisitinscotland;

/**
 * Created by user on 15/03/2017.
 */

public class Places {

    private int ranking;
    private String placename;
    private String location;


    public Places(Integer ranking, String placename, String location){
        this.ranking = ranking;
        this.placename = placename;
        this.location = location;

    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
