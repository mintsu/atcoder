package com.mintsudev.atcoder.practice.contest.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        List<String> list = new ArrayList<>();
        IntStream.rangeClosed(1, N)
                .forEach(i -> list.add(getCharFromNumber(i)));

        int qcount = 0;

        out_of_loop:
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if (qcount >= Q) {
                    break out_of_loop;
                }
                System.out.println("? " + list.get(i) + " " + list.get(j));
                String ans = sc.next();
                qcount++;

                switch(ans) {
                   case "<":
                       break;
                   case ">":
                       // swap
                       Collections.swap(list, i, j);
                       break;
                   default:
                       break;
                }
            }
        }

        System.out.println("! " + String.join("", list));

    }

    private static String getCharFromNumber(int i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
    }
}
