package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        int calcNum = Reader.chooseCacl();
        if (calcNum == 1) {
            System.out.println(twoCalc());
        } else if (calcNum == 2) {
            System.out.println(infCalc());
        } else {
            System.out.println("Input error. Closed");
        }

    }

    public static double twoCalc() {
        System.out.println("Введите число");
        double first = Reader.readNumber();
        char op = Reader.readOperator();
        if (op == '@') {
            System.out.println("Incorrect input");
            return -1;
        }
        System.out.println("Введите число");
        double second = Reader.readNumber();
        switch (op) {
            case ('+'):
                return Operations.add(first, second);
            case ('-'):
                return Operations.sub(first, second);
            case ('*'):
                return Operations.mul(first, second);
            case ('/'):
                return Operations.div(first, second);
            default:
                return -1;
        }
    }

    public static double infCalc() {
        System.out.println("Введите число");
        double prev = Reader.readNumber();
        while (true) {

            char op = Reader.readOperator();
            if (op == '@') {
                System.out.println("Incorrect input");
                return -1;
            }
            if (op == '#') {
                System.out.println("End");
                return prev;
            }
            System.out.println("Введите число");
            double next = Reader.readNumber();
            switch (op) {
                case ('+'):
                    prev = Operations.add(prev, next);
                    break;
                case ('-'):
                    prev = Operations.sub(prev, next);
                    break;
                case ('*'):
                    prev = Operations.mul(prev, next);
                    break;
                case ('/'):
                    prev = Operations.div(prev, next);
                    break;
                default:
                    return -1;

            }
        }
    }

}