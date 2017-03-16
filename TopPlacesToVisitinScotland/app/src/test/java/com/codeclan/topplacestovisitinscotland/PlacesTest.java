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

        assertEquals((Integer)7, places.getRanking());
    }

    @Test
    public void getPlacenameTest() {
        assertEquals("Strontian", places.getPlacename());

    }

    @Test
    public void getLocationTest() {
        assertEquals("West Coast", places.getLocation());

    }

}