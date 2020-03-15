package com.company;

public class Operations {
    public static Double add(Double a, Double b) {
        if(a == null || b == null){
            return null;
        }
        return a + b;
    }
    public static Double sub(Double a, Double b) {
        if(a == null || b == null){
            return null;
        }
        return a - b;
    }
    public static Double mul(Double a, Double b) {
        if(a == null || b == null){
            return null;
        }
        return a * b;
    }
    public static Double div(Double a, Double b) {
        if(a == null || b == null){
            return null;
        }
        if(b == 0){
            System.out.println("Div by zero error");
            return null;
        }
        return a / b;
    }
    public static Double pow(Double a, Double b) {
        if(a == null || b == null){
            return null;
        }
        return Math.pow(a,b);
    }
}
