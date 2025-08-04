import java.util.Arrays;
import java.util.Scanner;
public class TwoArraysIdentical{
    private static boolean checkArrays(char first[],char second[]){
        if(first.length!=second.length)return false;
        else{
            for(int i=0;i<first.length;i++){
                if(first[i]!=second[i])return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first Array size : ");
        int first=scan.nextInt();
        char firstArray[]=new char[first];
        for(int i=0;i<first;i++){
            System.out.print("Enter "+(i+1)+" Element : ");
            firstArray[i]=scan.next().charAt(0);
        }
        System.out.print("Enter the second Array size : ");
        int second=scan.nextInt();//input second array size and check two arrays size 
        if(first==second){
            char secondArray[]=new char[second];
            for(int i=0;i<second;i++){
                System.out.print("Enter "+(i+1)+" Element : ");
                secondArray[i]=scan.next().charAt(0);
            }      
            System.out.print("First array : "+Arrays.toString(firstArray)+"\n");
            System.out.print("Second array : "+Arrays.toString(secondArray)+"\n");
            boolean result=checkArrays(firstArray,secondArray);
            if(result)System.out.println("Two Arrays are identical");
            else System.out.println("Two Arrays are not identical");
        }
        else System.out.println("Two Arrays are not identical");
   }
}