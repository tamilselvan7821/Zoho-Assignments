import java.util.Scanner;
public class WPattern{
    static void wPattern(int value){
        int count=0;
        int ch=value;
        int i=1;
        while(ch>0){
            if(i<=((value+1)/2))count++;
            else count--;
            int j=1;
            while(count>=j){
                System.out.print("W");
                j++;
            }
            ch--;
            i++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter W pattern Length : ");
        int value=scan.nextInt();
        wPattern(value);
    }
}