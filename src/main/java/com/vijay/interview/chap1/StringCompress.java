package com.vijay.interview.chap1;

public class StringCompress {


    public static String compress(String s){

        String s2 = "";
        int consecutiveCount = 0;

        for(int i=0; i<s.length() ; i++){

            consecutiveCount++;
            if(i+1 >=s.length() || s.charAt(i) != s.charAt(i+1)){

                s2= s2 + s.charAt(i) + consecutiveCount;
                consecutiveCount =0;
            }
        }
        return s2.length() < s.length() ? s2:s;

    }

    public static void main(String[] args) {
        System.out.println(compress("aabcccddddee"));
    }
}
