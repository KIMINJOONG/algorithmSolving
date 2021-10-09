package com.company;

import java.util.Scanner;

public class FindNumber {
    public static int solution(String str) {
//        int answer = 0;
//
//        for(char x : str.toCharArray()) {
//            // '0' ~ '9'
//            if(x >= 48 && x <= 57) {
//                answer = answer * 10 + (x-48);
//            }
//        }
        String answer = "";
        for(char x: str.toCharArray()) {
            if(Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
