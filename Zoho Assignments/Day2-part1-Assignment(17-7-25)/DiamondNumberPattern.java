import java.util.Scanner;

public class DiamondNumberPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the diamond (odd number recommended): ");
        int n = scanner.nextInt();
        scanner.close();
        int start=1;
        int count=n/2+1;
        int ind=1;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <=count; j++) {
                System.out.print("  ");
            }
            // Print numbers
            for (int k = 1; k <=ind; k++) {
                if(start<=9)System.out.print("0"+(start++)+"  "); // Prints the row number
                else System.out.print((start++)+"  ");
            }
            if(i<=n/2){
                count--;
                ind++;
            }
            else{
                count++;
                ind--;
            }
            System.out.println(); // Move to the next line
        }
    }
}