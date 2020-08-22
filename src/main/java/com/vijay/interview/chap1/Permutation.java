package com.vijay.interview.chap1;

import java.util.Arrays;

public class Permutation {

    public static boolean permutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        return sort(s1).equals(sort(s2));
    }

    public static String sort(String s){
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static boolean permutation2(String s1, String s2){
        if(s1.length() != s2.length()){
            return  false;
        }
        char[] charArr = s1.toCharArray();
        int[] letters = new int[128];

        for(char c: charArr){
            letters[c]++;
            System.out.println(letters[c]);
        }

        for(int i=0; i<s2.length(); i++){
            int c = (int)s2.charAt(i);
            letters[c]--;
            if(letters[c] <0){
                return false;
            }
        }

        return true;
    }
}
