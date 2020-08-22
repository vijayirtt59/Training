package com.vijay.interview.chap1;

public class StringRotation {

    public static void main(String[] args) {

        System.out.println(rotation("vijay", "jayvi"));
        System.out.println(rotation("vijay", "jayvj"));
    }

    public static boolean rotation(String s1, String s2){
        if(s1.length() == s2.length() && s1.length() >0){
            String concatS1 = s1 + s1;
            if(isSubstring(concatS1, s2)){
                return true;
            }
        }
        return false;
    }

    public static boolean isSubstring(String s1, String s2){
        if(s1.contains(s2)){
            return true;
        }
        return false;
    }
}
