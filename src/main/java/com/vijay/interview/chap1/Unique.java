package com.vijay.interview.chap1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Unique {

    public static boolean uniqueString(String testString){

        int[] testArr = new int[128];
        Arrays.fill(testArr, -1);

        for(char s: testString.toCharArray()){
            if(testArr[s] != -1){
                return false;
            }else{
                testArr[s] = s;
            }
        }
        return true;
    }

    public static boolean uniqueString2(String testString){
        char[] charArr = testString.toCharArray();
        Set<Character> hashSet = new HashSet<>();
        for(char s: charArr){
            if(hashSet.contains(s)){
                return false;
            }else{
                hashSet.add(s);
            }
        }
        return true;
    }
}

