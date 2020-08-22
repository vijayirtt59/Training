package com.vijay.interview.chap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class replaceStringTest {

    @Test
    public void testReplaceString(){
        assertEquals("Mr%20John%20Smith", replaceString.replaceString("Mr John Smith".toCharArray(), 13));
        assertEquals("Mr%20John%20Smith", replaceString.replaceString("Mr John Smith   ".toCharArray(), 13));
    }

}