/*
Design a calculator application using Java Inheritance.
Create the following class hierarchy:
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.
*/
import java.util.Scanner;
public class Calculator{
    public static void basicCalculator(Scanner scan){
        BasicCaluculator bs=new BasicCaluculator();
        while(true){
            System.out.println("press 1 > add");
            System.out.println("press 2 > subtract");
            System.out.println("press 3 > multiply");
            System.out.println("press 4 > division");
            System.out.println("press 5 > back");
            System.out.print("Enter input : ");
            String ins=scan.nextLine();
            int a,b;
            switch(ins){
                case "1":System.out.print("Enter input a value : ");a=scan.nextInt();
                         System.out.print("Enter input b value : ");b=scan.nextInt();
                         System.out.println("Result is (a+b) value : "+bs.add(a,b));scan.nextLine();break;
                case "2":System.out.print("Enter input a value : ");a=scan.nextInt();
                         System.out.print("Enter input b value : ");b=scan.nextInt();
                         System.out.println("Result is (a-b) value : "+bs.subtract(a,b));scan.nextLine();break;
                case "3":System.out.print("Enter input a value : ");a=scan.nextInt();
                         System.out.print("Enter input b value : ");b=scan.nextInt();
                         System.out.println("Result is (a*b) value : "+bs.multiply(a,b));scan.nextLine();break;
                case "4":System.out.print("Enter input a value : ");a=scan.nextInt();
                         System.out.print("Enter input b value : ");b=scan.nextInt();
                         System.out.println("Result is (a/b) value : "+bs.divide(a,b));scan.nextLine();break;
                case "5":return;
                default : System.out.println("Invalid input ...."); 
            }
        }
    }
    public static void advancedCalculator(Scanner scan){
        AdvancedCalculator as=new AdvancedCalculator();
        while(true){
            System.out.println("press 1 > Power");
            System.out.println("press 2 > Modulus");
            System.out.println("press 3 > Square Root");
            System.out.println("press 4 > back");
            System.out.print("Enter input : ");
            String ins=scan.nextLine();
            int a,b;
            switch(ins){
                case "1":System.out.print("Enter input Base value : ");a=scan.nextInt();
                         System.out.print("Enter input Exponenet value : ");b=scan.nextInt();
                         System.out.println("Result of power value : "+as.power(a,b));scan.nextLine();break;
                case "2":System.out.print("Enter input a value : ");a=scan.nextInt();
                         System.out.print("Enter input b value : ");b=scan.nextInt();
                         System.out.println("Result of Modulus value : "+as.modulus(a,b));scan.nextLine();break;
                case "3":System.out.print("Enter input the value : ");double val=scan.nextDouble();
                         System.out.println("Result of Square value : "+as.squareRoot(val));scan.nextLine();break;
                case "4":return;
                default : System.out.println("Invalid input ...."); 
            }
        }
    }
    public static void scientificCalculator(Scanner scan){
        ScientificCalculator sc=new ScientificCalculator();
        while(true){
            System.out.println("press 1 > sin");
            System.out.println("press 2 > cos");
            System.out.println("press 3 > log");
            System.out.println("press 4 > exp");
            System.out.println("press 5 > back");
            System.out.print("Enter input : ");
            String ins=scan.nextLine();
            double a;
            switch(ins){
                case "1":System.out.print("Enter input value (sin) : ");a=scan.nextDouble();
                         System.out.println("Result of sin value : "+sc.sin(a));scan.nextLine();break;
                case "2":System.out.print("Enter input value (cos) : ");a=scan.nextDouble();
                         System.out.println("Result of cos value : "+sc.cos(a));scan.nextLine();break;
                case "3":System.out.print("Enter input value (log) : ");a=scan.nextDouble();
                         System.out.println("Result of log value : "+sc.log(a));scan.nextLine();break;
                case "4":System.out.print("Enter input value (exp) : ");a=scan.nextDouble();
                         System.out.println("Result of exp value : "+sc.exp(a));scan.nextLine();break;
                case "5":return;
                default : System.out.println("Invalid input ...."); 
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("press 1 > Basic Calculator");
            System.out.println("press 2 > Advance Calculator");
            System.out.println("press 3 > Scientific Calculator");
            System.out.println("press 4 > Quit");
            System.out.print("Enter the input > ");
            String input=scan.nextLine();
            switch(input){
                case "1":basicCalculator(scan);break;
                case "2":advancedCalculator(scan);break;
                case "3":scientificCalculator(scan);break;
                case "4":System.out.println("-----Program Ended-----");return;
                default : System.out.println("Invalid input ...."); 
            }
        }
    }
}
class BasicCaluculator{
    int add(int a,int b){
        return a+b;
    }
    int subtract(int a,int b){
        return a-b;
    }
    int multiply(int a,int b){
        return a*b;
    }
    int divide(int a,int b){
        return a/b;
    }
}
class AdvancedCalculator extends BasicCaluculator{
    int power(int base,int exponent){
        int result=1;
        for(int i=1;i<=exponent;i++)result*=base;
        return result;
    }
    int modulus(int a,int b){
        return a%b;
    }
    int squareRoot(double number){
        return (int)Math.sqrt(number);
    }
}
class ScientificCalculator extends AdvancedCalculator{
    double sin(double angle){
        double radian=Math.toRadians(angle);
        return Math.sin(radian);
    }
    double cos(double angle){
        double radian=Math.toRadians(angle);
        return Math.cos(radian);
    }
    double log(double value){
        return Math.log10(value);
    }
    double exp(double value){
        return Math.exp(value);
    }
}