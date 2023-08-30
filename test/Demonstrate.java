package test;

import java.util.Scanner;

/**
 * Demonstrate.
 */
public class Demonstrate {
    /**
     * main.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력하세요 : ");
        int year = sc.nextInt();
        checkYear(year);

        System.out.println("day를 입력하세요 : ");
        int day = sc.nextInt();
        if (day >= 365) throw new IllegalArgumentException("365일보다 작은 수를 입력");

        dayTran(year, day);

        sc.close();
    }

    /**
     * checkYear.
     */
    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("윤년입니다.");
            return;
        }
        System.out.println("평년입니다.");
    }

    /**
     * dayTran.
     */
    public static void dayTran(int year, int day) {
        int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            month[1]++;
        }


        for (int i = 0; i < 12; i++) {
            if (day > 0) {
                day -= month[i];
            } else {
                System.out.println(i + "월 " + (day + month[i] + 1) + "일 입니다.");
                return;
            }
        }

    }
}
