package com.company.ch02;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
//    public static ArrayList<Integer> solution(int n) {
//        ArrayList<Integer> answer = new ArrayList<>();
//        answer.add(1);
//        answer.add(1);
//        for(int i = 2; i < n; i++) {
//            answer.add(answer.get(i - 2) + answer.get(i - 1));
//        }
//        return answer;
//    }
    public static void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
//        for(int x: solution(n)) {
//            System.out.print(x + " ");
//        }
        solution(n);
    }
}
