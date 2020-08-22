package com.vijay.interview.chap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueTest {

    @Test
    public void testUniqueString(){
        assertTrue(Unique.uniqueString("Vijay"));
        assertFalse(Unique.uniqueString("Dharani"));
    }

    @Test
    public void testUniqueString2(){
        assertTrue(Unique.uniqueString2("Vijay"));
        assertFalse(Unique.uniqueString2("Dharani"));
    }

}