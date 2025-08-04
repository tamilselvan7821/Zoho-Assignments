import java.util.Scanner;
public class PascalTrianglePattern{
    static void printPattern(int value){
        for(int i=0;i<value;i++){
            for(int j=0;j<value-i;j++){
                System.out.print(" ");
            }
            int start=1;
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=start*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the input Triangle pattern Rows : ");
        int value=scan.nextInt();
        printPattern(value);
    }
}
