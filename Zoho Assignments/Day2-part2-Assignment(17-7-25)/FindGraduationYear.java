import java.util.Scanner;
public class FindGraduationYear{
    private static boolean checkYear(int arr[],int left,int right,int year){
        while(left<=right){
            int mid=(right+left)/2;
            if(arr[mid]==year)return true;
            else if(arr[mid]>year)right=mid-1;
            else left=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]={1982,1987,1993,1996,1999,2003,2006,2007,2009,2010,2016,2022};
        System.out.print("Enter Your Graduation Year : ");
        int year=scan.nextInt();//input the graduation from user 
        int left=0;
        int right=arr.length;
        boolean result=checkYear(arr,left,right,year);//check method in true or false
        if(result)System.out.println("Record exists");
        else System.out.println("Record not exists");
    }
}