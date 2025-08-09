/*
Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote.
Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate
messages for eligible and ineligible voters.
*/
import java.util.Scanner;
public class VotersEligibleScenario{
    public static void main(String[] args) throws Voters{
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age=scan.nextInt();
        try {
            if(age>=18) throw new Voters("Eligible");
            else throw new Voters("Ineligible");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Voters extends Exception{
    public Voters(String message){
        super(message);
    }
}