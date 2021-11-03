package com.company.ch02;

import java.util.Scanner;

public class CalScore {
    public static int solution(int n, int[] number) {
        int answer = 0;
        int sum = 0;
        int cnt = 0;
        for(int i = 0; i < number.length; i++) {
            if(number[i] == 1) {
                cnt++;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }
        answer = sum;
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];

        for(int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }

        System.out.println(solution(n, number));

    }
}
