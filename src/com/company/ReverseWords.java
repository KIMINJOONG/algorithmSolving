package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWords {

    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<String>();
//        for(String x: str) {
//            String temp = new StringBuilder(x).reverse().toString();
//            answer.add(temp);
//        }

        for(String x: str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String temp = String.valueOf(s);
            answer.add(temp);
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i =0; i < n; i++) {
            str[i] = kb.next();
        }

        for(String x: solution(n, str)) {
            System.out.println(x);
        }
    }
}
