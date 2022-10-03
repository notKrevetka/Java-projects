package com.company.test;

import com.company.Loor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoorTest {

    @org.junit.jupiter.api.Test
    void fac() {
        Assertions.assertEquals(1, Loor.fac(0));
        Assertions.assertEquals(24, Loor.fac(4));
    }

    @org.junit.jupiter.api.Test
    void pow() {
    }

    @Test
    void sin() {
        Assertions.assertEquals(0.1,0.5, Loor.sin( Math.toRadians(30)));
//        Assertions.assertEquals(24, Loor.fac(4));
    }
    @Test
    void exp() {
        Assertions.assertEquals(0.1,31, Loor.exp( (30)));
//        Assertions.assertEquals(24, Loor.fac(4));
    }
}