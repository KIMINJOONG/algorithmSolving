package com.company.ch02;

import java.util.ArrayList;
import java.util.Scanner;

public class GetRank {
    public static ArrayList<Integer> solution(int n, int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int count = 1;

            for(int j = 0; j < n; j++) {
                if(numbers[i] < numbers[j]) {
                    count++;
                }
            }
            answer.add(count);
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = kb.nextInt();
        }

        for(int x : solution(n, numbers)) {
            System.out.print(x + " ");
        }
    }
}
