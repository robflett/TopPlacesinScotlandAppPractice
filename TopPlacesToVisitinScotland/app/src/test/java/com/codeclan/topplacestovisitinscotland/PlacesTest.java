package com.codeclan.topplacestovisitinscotland;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class PlacesTest {

    Places places;

    @Before
    public void before() {
        places = new Places(7, "Strontian", "West Coast");
    }


    @Test
    public void getRankingTest() {
        assertEquals(7, places.getRanking() );
    }

}