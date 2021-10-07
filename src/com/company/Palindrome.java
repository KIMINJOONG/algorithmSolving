package com.company;

import java.util.Scanner;

public class Palindrome {
    public static String solution(String str) {
        String answer = "NO";
//        str = str.toUpperCase();
//        int length = str.length();
//        for(int i = 0; i < length / 2; i++) {
//            if(str.charAt(i) != str.charAt(length - i - 1)) {
//                return "NO";
//            }
//        }
        String temp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(temp)) {
            answer = "YES";
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
