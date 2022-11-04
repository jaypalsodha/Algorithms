package com.home;

public class Recursion {

    public static void main(String[] args) {

    }

    public static int iterativeFactorial(int n) {
        int factorial = 1;
        if (n == 0) {
            return factorial;
        }
        for (int i = 0; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int n) {
        if ( n == 0) {
            return 1;
        }
        return n * recursiveFactorial(n-1);
    }
}
