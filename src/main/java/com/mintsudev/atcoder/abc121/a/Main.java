package com.mintsudev.atcoder.abc121.a;

// https://atcoder.jp/contests/abc121/tasks/abc121_a

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();


        int result = (H-h) * (W-w);

        System.out.println(result);
    }
}

