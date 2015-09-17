package com.anku.fibonacci;

class Fibonacci {
    public static void main(String[] args) {
        int a = 1, b, c = 1;
        System.out.println("Fibonacci numbers:");
        System.out.println(a);

        System.out.println(c);

        for (int i = 0; i < 8; i++) {
            b = a;
            a = c;
            c = a + b;
            System.out.println(c);
        }
    }
}
