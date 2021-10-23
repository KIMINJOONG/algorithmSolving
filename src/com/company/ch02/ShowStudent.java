package com.company.ch02;

import java.util.Scanner;

public class ShowStudent {
    public static int solution(int n, int[] students) {
        int answer = 1;
        int max = students[0];

        for(int i =0; i < n; i++) {
            if(students[i] > max) {
                answer++;
                max = students[i];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] students = new int[n];
        for(int i = 0; i < n; i++) {
            students[i] = kb.nextInt();
        }
        System.out.print(solution(n, students));
    }
}
