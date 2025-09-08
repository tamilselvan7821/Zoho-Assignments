/*
Create a Java application that demonstrates the use of user-defined packages by organising classes based on their
functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two
numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods
*/
import arithmetic.ArithmeticOperations;
import java.util.Scanner;
import stringutils.StringMethods;
public class UserDefinedPackageInbuiltMeyhods{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArithmeticOperations arith=new ArithmeticOperations();
        StringMethods inbuilt=new StringMethods();
        //arithmetic operatins
        System.out.println("Arithmetic Operations : ");
        System.out.print("Enter the a value : ");
        int a=scan.nextInt();
        System.out.print("Enter the b value : ");
        int b=scan.nextInt();scan.nextLine();
        System.out.println("Addition : "+arith.addition(a,b));
        System.out.println("Subtraction : "+arith.subtraction(a, b));
        System.out.println("Multification : "+arith.multification(a, b));
        System.out.println("Division : "+arith.division(a, b));
        System.out.println("Modulo : "+arith.modulo(a, b));

        //String methods
        System.out.println("string methods : ");
        System.out.print("Enter first string : ");
        String first=scan.nextLine();
        System.out.print("Enter second string : ");
        String second=scan.nextLine();
        System.out.println("Concate two strings : "+inbuilt.concateTwoStrings(first,second));
        System.out.println("reverse first string : "+inbuilt.reverseString(first));
        System.out.println("length of second string : "+inbuilt.length(second));
    }
}