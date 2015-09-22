package com.anku.algorithms;

import java.util.Scanner;
import java.util.Stack;

class Expressions {
    private static char[] operator = {'(', ')', '-', '+', '/', '*'};
    private static int[] priority = {1, 1, 2, 2, 3, 3};

    public static void main(String[] args) {
        char[] infixExpression;
        char[] postfixExpression = new char[50];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an expression (Example: A+B*C-D/E) ");
        infixExpression = in.nextLine().toCharArray();
        int k = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < infixExpression.length; i++) {
            if (Character.isAlphabetic(infixExpression[i]) || Character.isDigit(infixExpression[i])) {
                postfixExpression[k] = infixExpression[i];
                k++;
            } else {
                if (stack.empty() || infixExpression[i] == '(') {
                    stack.push(infixExpression[i]);
                } else {
                    if (infixExpression[i] != ')') {
                        while (!stack.empty() && comparePriority(stack.peek(), infixExpression[i])) {
                            postfixExpression[k] = stack.pop();
                            k++;
                        }
                        stack.push(infixExpression[i]);
                    } else {
                        while (stack.peek() != '(') {
                            postfixExpression[k] = stack.pop();
                            k++;
                        }
                        stack.pop();
                    }
                }
            }
        }
        while (!stack.empty()) {
            postfixExpression[k] = stack.pop();
            k++;
        }
        System.out.println("PostFix Expression: " + String.copyValueOf(postfixExpression, 0, k));
    }


    private static boolean comparePriority(char x, char y) {
        int priorityOfX = 0, priorityOfY = 0;
        for (int i = 0; i < operator.length; i++) {
            if (operator[i] == x) {
                priorityOfX = priority[i];
                break;
            }
        }

        for (int i = 0; i < operator.length; i++) {
            if (operator[i] == y) {
                priorityOfY = priority[i];
                break;
            }
        }
        return priorityOfX >= priorityOfY;
    }
}
