package jdev;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Strelnik on 26.02.2022.
 */
public class PointDTOTest {

    @Test
    public void toJson() throws Exception {
        PointDTO point = new PointDTO();
        point.setLat(56);
        point.setLon(74);
        point.setAutoId("o567gfd");
        assertTrue(point.toJson().contains("\"lat\":56"));
    }
}