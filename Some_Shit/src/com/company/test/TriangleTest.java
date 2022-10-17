package com.company.test;

import com.company.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    public void SquareCheck() {
        Triangle treugolnik = new Triangle(-5,4,3);
        double actualArea = treugolnik.square();
        double expectedArea =  ;
        assertEquals(expectedArea, actualArea, 0.01, "ne norm");
    }
}