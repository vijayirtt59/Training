package com.vijay.interview.chap1;

import com.sun.org.apache.xml.internal.security.keys.ContentHandlerAlreadyRegisteredException;

/**
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations:"taco cat'; "atco cta'; etc.)
 **/
public class PermutationPalindrome {


    public static boolean permutationPalindrome(String s){
        int[] table = buildFrequencyTable(s);
        return checkMaxOneOdd(table);
    }
    public static int getNumericValue(Character c) {

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    public static int[] buildFrequencyTable(String s) {
        int[] table = new int[Character.getNumericValue('z') -
                Character.getNumericValue('a') + 1];

        for(char c: s.toCharArray()){
            int x = getNumericValue(c);
            if(x!=-1){
                table[x]++;
            }
        }
        return table;
    }

    public static boolean checkMaxOneOdd(int[] table){
        boolean foundOneMax = false;

        for(int a: table){
            if(a%2 == 1){
                if(foundOneMax){
                    return false;
                }
                foundOneMax = true;
            }
        }
        return foundOneMax;
    }

    public static void main(String[] args) {
        System.out.println(permutationPalindrome("Tact Coa"));
        System.out.println(permutationPalindrome("Vijay"));
    }

}
