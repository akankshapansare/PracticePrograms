package com.anku.datastructure;

import java.util.Scanner;

class Stack {
    public static void main(String[] args) {

        int[] A = new int[10];
        int a, b, i = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number 0 or 1 to pop or push in the stack");
            a = in.nextInt();
            if (a == 1) {
                if (i >= 10) {
                    System.out.println("Stack is full");
                } else {
                    System.out.println("Enter a number to push in the stack");
                    b = in.nextInt();
                    A[i] = b;
                    i++;
                }
            }
            if (a == 0) {
                if (i == 0) {
                    System.out.println("Stack is empty");
                } else {
                    i--;
                    System.out.println("Integer you poped is " + A[i]);
                }
            }
        }
    }
}
