package com.anku.prime;

import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        int d = 0, c, a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not");
        c = in.nextInt();
        for (int i = 2; i < c; i++) {
            a = c % i;
            if (a != 0) {

            } else {
                d = 1;
            }
        }
        if (d == 0) {
            System.out.println(c + " is a prime number.");
        } else {
            System.out.println(c + " is not a prime number.");
        }
    }
}
