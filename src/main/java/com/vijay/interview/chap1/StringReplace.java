package com.vijay.interview.chap1;

public class StringReplace {

    public static String replace(String s, int length){

        char[] originalArr = s.toCharArray();
        int spaceCount = 0;
        for(int i=0; i< length; i++){
            if(originalArr[i] == ' '){
                spaceCount++;
            }
        }
        System.out.println("Length of Char Array before trim: " + originalArr.length  + "True Length: " + length);
        int newLength = length + spaceCount*2;
        if(length < originalArr.length){
            originalArr[length] = '\0';
        }
        System.out.println("Length of Char Array After trim: " + originalArr.length   + "True Length: " + length);

        System.out.println(newLength);
        char[] newArr = originalArr;
        originalArr = new char[newLength];

        for(int i = length -1; i>=0; i--){
            if(newArr[i] == ' '){
                originalArr[newLength-1] = '0';
                originalArr[newLength-2] = '2';
                originalArr[newLength-3] = '%';
                newLength = newLength - 3;
            }else{
                originalArr[newLength - 1] = newArr[i];
                newLength--;
            }
        }

        return new String(originalArr);
    }
}
