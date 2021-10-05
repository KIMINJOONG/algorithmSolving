package com.company;

import java.util.Scanner;

public class ReverseSpecificCharacter {
    public static String solution(String str) {
        String answer = "";
        char[] x = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            char tmp = x[lt];
            if(!Character.isAlphabetic(x[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(x[rt])) {
                rt--;
            } else {
                x[lt] = x[rt];
                x[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(x);
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
