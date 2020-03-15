package com.company;

import java.util.Scanner;

public class Reader {
    public static double readNumber() {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        return num;

    }

    public static int chooseCacl() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберете свой калькулятор: ");
        System.out.println("1. Для двух чисел");
        System.out.println("2. Для бесконечного количества чисел");
        int res = in.nextInt();

        switch (res) {
            case (1):
                return 1;
            case (2):
                return 2;
            default:
                return -1;
        }


    }

    public static char readOperator() {
        Scanner in = new Scanner(System.in);
        System.out.println("Доступные действия:");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. ^");
        System.out.println("0. exit");

        int res = in.nextInt();

        switch (res) {
            case (1):
                return '+';
            case (2):
                return '-';
            case (3):
                return '*';
            case (4):
                return '/';
            case (5):
                return '^';
            case (0):
                return '#';
            default:
                return '@';
        }

    }
}
