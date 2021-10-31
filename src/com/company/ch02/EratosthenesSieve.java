package com.company.ch02;

import java.util.Scanner;

public class EratosthenesSieve {
    public static int solution(int n) {
        int ansewr = 0;
        int[] ch = new int[n + 1];
        for(int i = 2; i <= n;  i++) {
            if(ch[i] == 0) {
                ansewr++;
                for(int j = i; j <= n; j = j + i) {
                    ch[j] = 1;
                }
            }
        }

        return ansewr;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(solution(n));

    }
}
