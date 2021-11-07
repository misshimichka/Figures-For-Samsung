package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Codes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long x = scanner.nextLong();
        long summ = m;
        long num = m;
        int count = 0;
        for (int i = 0; i < n; i++){
            if (num == n) {
                summ += n;
                num = m;
            } else {
                summ += m;
                num = n;
            }
            count += 1;
            if (summ == x) {
                System.out.print(count);
                break;
            }
        }

    }
}