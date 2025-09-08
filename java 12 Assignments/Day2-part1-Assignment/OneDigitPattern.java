import java.util.Scanner;
public class OneDigitPattern{
    static void printPattern(int value){
        for(int i=1;i<=value;i++){
            for(int j=1;j<=value;j++){
                if(i==j||j==(value+1-i))System.out.print(1);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the value only odd numbers : ");
        int value=scan.nextInt();
        printPattern(value);
    }
}