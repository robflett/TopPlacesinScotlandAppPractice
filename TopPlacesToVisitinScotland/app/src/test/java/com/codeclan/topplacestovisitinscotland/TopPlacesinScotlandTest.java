package com.codeclan.topplacestovisitinscotland;


import org.junit.Test;

import static org.junit.Assert.*;

public class TopPlacesinScotlandTest {

    @Test
    public void getListTest() {
        TopPlacesinScotland topPlaces = new TopPlacesinScotland();
        assertEquals(20, topPlaces.getList().size());
    }
}
