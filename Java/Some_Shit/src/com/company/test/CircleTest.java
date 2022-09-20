package com.company.test;

import com.company.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void SquareCheck() {
        Circle firstCircle = new Circle(5);
        double actualArea = firstCircle.square();
        double expectedArea = 78.53;
        assertEquals(actualArea, expectedArea, 0.01, "ne norm");
    }
}