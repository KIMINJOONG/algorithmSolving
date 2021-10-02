package com.company;

import java.util.Scanner;

public class UpperCaseLowerCaseConvert {
    // 내가 푼 해답
    public static String solution(String str) {
        String answer = "";
        for(char c : str.toCharArray()) {
//            if(Character.isUpperCase(c)) answer += Character.toLowerCase(c);
//            else answer += Character.toUpperCase(c);

            // 대문자 아스키 넘버 범위 65 ~ 90
            // 소문자 아스키 97 ~ 122
            // 97 - 65 = 32
            // 소문자에서 -32를 하면 대문자가 된다.
            // 소문자 체크
            if(c >= 97 && c <= 122) answer += (char)(c-32);
            else answer += (char)(c+32);

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));

    }


    //
}
