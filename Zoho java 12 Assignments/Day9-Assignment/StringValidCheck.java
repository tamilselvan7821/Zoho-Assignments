/*
 Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using
try-catch.
*/
import java.util.Scanner;
public class StringValidCheck{
    private static void parseInt(String value){
        try {
            int result=Integer.parseInt(value);
            System.out.println("Valid NUmber");
        } catch (NumberFormatException e) {
            System.out.println("Not valid Number");
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        String input=scan.nextLine();
        parseInt(input);//pass an argument in parseInt
    }
}