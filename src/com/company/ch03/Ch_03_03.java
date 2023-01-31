package com.company.ch03;

import java.util.Scanner;

public class Ch_03_03 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for(int i = k; i<n; i++) {
            sum += (arr[i] = arr[i - k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    public static void main(String[] args) {
        Ch_03_03 T = new Ch_03_03();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
