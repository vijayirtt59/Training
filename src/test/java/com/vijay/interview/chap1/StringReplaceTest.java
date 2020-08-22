package com.vijay.interview.chap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReplaceTest {

    @Test
    public void testReplaceString(){
        assertEquals("Mr%20John%20Smith", StringReplace.replace("Mr John Smith", 13));
        assertEquals("Mr%20John%20Smith", StringReplace.replace("Mr John Smith   ", 13));
    }

}