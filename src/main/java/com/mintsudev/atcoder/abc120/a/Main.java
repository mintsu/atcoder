package com.mintsudev.atcoder.abc120.a;

// https://atcoder.jp/contests/abc120/tasks/abc120_a

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = B/A;
        int result = C < max ? C : max;

        System.out.println(result);
    }
}
