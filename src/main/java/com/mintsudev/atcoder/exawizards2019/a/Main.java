package com.mintsudev.atcoder.exawizards2019.a;

// https://atcoder.jp/contests/exawizards2019/tasks/exawizards2019_a

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String ans;

        if (A == B && B == C) {
            ans = "Yes";
        } else {
            ans = "No";
        }

        System.out.println(ans);

    }
}
