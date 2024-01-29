
package test;

import views.CalculatorMenu;


public class ComputerProgram {
    public static void main(String[] args) {
        String[] choices = {"Normal Calculator", "BMI Calculator", "Exit"};
        new CalculatorMenu("========= Calculator Program =========", choices).run();
    }
}
