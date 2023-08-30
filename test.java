package test;

import java.util.Random;

public class test {

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Random ran = new Random();
        System.out.println("please enter expression!");
        int a = 3;
        int b = 3;
        System.out.println(sum(a, b));

        System.out.println("a = " + a);
        int i = 1;
    }
}
