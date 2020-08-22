package com.vijay.interview.chap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {

    @Test
    public void testPermutation(){
        assertTrue(Permutation.permutation("dcba", "dcab"));
        assertFalse(Permutation.permutation("dcba", "aced"));
    }

    @Test
    public void testPermutation2(){
        assertTrue(Permutation.permutation2("dcbaaaabbcdd", "dcabaaacbbdd"));
        assertFalse(Permutation.permutation2("dcba", "aced"));
        }

}