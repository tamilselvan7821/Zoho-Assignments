/*
Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following
conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.
*/
import java.util.Scanner;
public class FourDigitPin{
    private static String validPin(String result){
        try{
            int pin=Integer.parseInt(result);
            if(result.charAt(0)=='0')return "Invalid pin";
            if(result.length()!=4)return "Invalid pin";
        }
        catch(NumberFormatException e){
            return "Invalid pin";
        }
        return "Valid pin";
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Pin : ");
        String result=scan.nextLine();
        System.out.println(validPin(result));
    }
}