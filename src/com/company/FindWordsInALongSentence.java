package com.company;

import java.util.Scanner;

public class FindWordsInALongSentence {
    public static String solution(String str) {
        String answer = "";
        int m =Integer.MIN_VALUE, pos;


//        String[] s = str.split(" ");
//
//        for(String value : s) {
//            if(value.length() > m) {
//                m = value.length();
//                answer = value;
//            }
//        }

        while ((pos = str.indexOf(' ')) != -1) {
            String temp = str.substring(0, pos);
            int len = temp.length();
            if(len > m) {
                m = len;
                answer = temp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length() > m) {
            answer = str;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));

    }
}
