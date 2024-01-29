package controllers;

import models.Calculator;

public class Calculation {

    private Calculator c;

    public Calculation() {
        c = new Calculator();
    }

    public Calculation(double num) {
        c = new Calculator(num);
    }

    public double printResult() {
        return c.getResult();
    }

    public void calculate(double num, String op) {
        if (op.trim().equals("+")) {
            c.sum(num);
        }

        if (op.trim().equals("-")) {
            c.subtract(num);
        }
        if (op.trim().equals("*")) {
            c.multiple(num);
        }
        if (op.trim().equals("/")) {
            c.divideBy(num);
        }
        if (op.trim().equals("^")) {
            c.exponent(num);
        }
    }
    
    private double computeBMI(double weight, double height) {
        return weight/(height * height)*10000;
    }
    
    public void resultBMI(double weight, double height) {
        double BMI = computeBMI(weight, height);
        System.out.println("BMI Number: " + BMI);
        if (BMI < 19) {
            System.out.println("Under-standard!!");
        }
        
        if (BMI >= 19 && BMI <= 25) {
            System.out.println("Standard!!");
        }
        if (BMI > 25 && BMI <= 30) {
            System.out.println("Overweight!!");
        }
        if (BMI > 30 && BMI <= 40) {
            System.out.println("Fat - should lose weight!!");
        }
        if (BMI > 40) {
            System.out.println("Very fat - should lose weight immediately");
        }
    }
}
