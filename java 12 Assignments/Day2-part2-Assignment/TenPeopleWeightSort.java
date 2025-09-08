import java.util.Arrays;
import java.util.Scanner;
public class TenPeopleWeightSort{
    private static void sortDecending(int arr[],Scanner scan){
        //input from user in ten person weight
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+(i+1)+" person Weight : ");
            arr[i]=scan.nextInt();
        }
        //sort decending in selection sort 
        for(int i=0;i<arr.length-1;i++){
            int ind=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[ind]<arr[j])ind=j;
            }
            if(arr[ind]!=arr[i]){
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[10];
        sortDecending(arr,scan);
        System.out.println("Decending order of age : "+Arrays.toString(arr));//print array in decending order
        scan.close();
    }
}