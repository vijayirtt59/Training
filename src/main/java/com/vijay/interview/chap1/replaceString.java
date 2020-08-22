package com.vijay.interview.chap1;

public class replaceString {

    /**
     * Input : "Mr John Smith", 13
     * Output : Mr%20John%20Smith
     *
     * Input : "Mr John Smith   ", 13
     * Output : Mr%20John%20Smith
     * @param charArr
     * @param trueLength
     * @return
     */
    public static String replaceString(char[] charArr, int trueLength){

        int index, spaceCount = 0, i =0;
        for(i=0; i< trueLength; i++){
                if(charArr[i] == ' '){
                    spaceCount++;
                }
        }
        index = trueLength + spaceCount*2;
        System.out.println(index);
        char newChar[] = charArr;
        charArr = new char[index];

        for(i= trueLength -1; i >=0; i--){
            if(newChar[i] == ' '){
                charArr[index-1] = '0';
                charArr[index-2] = '2';
                charArr[index-3] = '%';
                index = index -3;
            }else{
                charArr[index - 1] = newChar[i];
                index--;
            }
        }
        return new String(charArr);
    }
}
