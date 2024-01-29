
package views;

import controllers.Calculation;
import controllers.Validation;

public class CalculatorMenu extends Menu{
    Validation val = new Validation();
    Calculation cal = new Calculation();

    public CalculatorMenu(String title, String[] choices) {
        super(title, choices);
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                System.out.println("----- Normal Calculator -----");
                double num;
                while (true) {                        
                    System.out.print("Enter number: ");
                    num = val.inputDouble();
                    if (!(num == Double.MAX_VALUE)) {
                        break;
                    }
                }
                
                cal = new Calculation(num);
                
                while (true) {           
                    String op;
                    
                    while (true) {                        
                        System.out.print("Enter Operator: " + cal.printResult() + " ");
                        op = val.inputString();
                        if (op.trim().equals("=") || op.trim().equals("+") || op.trim().equals("-") || op.trim().equals("*") || op.trim().equals("/") || op.trim().equals("^")) {
                            break;
                        }
                    }
                    
                    if (op.trim().equals("=")) {
                        break;
                    }
                                      
                    while (true) {                        
                        System.out.print("Enter number: ");
                        num = val.inputDouble();
                        if (!(num == Double.MAX_VALUE)) {
                            break;
                        }
                    }
                    
                    cal.calculate(num, op);
                }
                System.out.println("Result: " + cal.printResult());
                break;
            case 2:
                System.out.println("----- BMI Calculator -----");
                double weight, height;
                while (true) {                    
                    System.out.print("Enter Weight(kg): ");
                    weight = val.inputDouble();
                    if (weight == Double.MAX_VALUE) {
                        System.out.println("BMI is digit!!");
                    } else {
                        break;
                    }
                }
                
                while (true) {                    
                    System.out.print("Enter Height(cm): ");
                    height = val.inputDouble();
                    if (height == Double.MAX_VALUE) {
                        System.out.println("BMI is digit!!");
                    } else {
                        break;
                    }
                }
                
                cal.resultBMI(weight, height);
                break;
        }
    }
    
}
