import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two numbers: ");
        double num1 = in.nextInt();
        double num2 = in.nextInt();
        
        System.out.println("Enter operator (+, -, *, /, %): ");
        char s = in.next().charAt(0);
        
        if (s == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (s == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (s == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (s == '/') {
           
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
            
        else if (s == '%') {
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        } else {
            System.out.println("Error: Invalid operator.");
        }

        in.close();
    }
}
