/*
 Write a program to find the first set bit of a number?
*/
import java.util.Scanner;
public class FirstSetBitNumber{
    static int getCount(int n){
        if(n==0)return 0;
        int count=0;
        while(n>0){
            count++;
            if((n&1)==1)return count;
            n=n/2;//n>>1
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int value=scan.nextInt();//value=2;
        System.out.println(getCount(value));
        // output : 2  
    }
}