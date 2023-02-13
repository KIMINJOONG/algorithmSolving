package com.company.ch03;

import java.util.Scanner;

public class Ch_03_06 {
    public int solution(int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if(n % cnt == 0) {
                answer++;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Ch_03_06 T = new Ch_03_06();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
