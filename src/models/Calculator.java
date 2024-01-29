package models;

public class Calculator {
    private double result;

    public Calculator() {
        result = 0;
    }

    public Calculator(double result) {
        this.result = result;
    }
    

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    public void sum(double d) {
        result += d;
    }
    
    public void subtract(double d) {
        result -= d;
    }
    
    public void multiple(double d) {
        result *= d;
    }
    
    public void divideBy(double d) {
        result /= d;
    }
    
    public void exponent(double d) {
        for (int i = 0; i < d; i++) {
            result *= result;
        }
    }

    @Override
    public String toString() {
        return "" + result;
    } 
}
