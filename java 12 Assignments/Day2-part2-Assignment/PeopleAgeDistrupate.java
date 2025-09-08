import java.util.Arrays;
import java.util.Scanner;
public class PeopleAgeDistrupate{
    private static void countPeople(int arr[],Scanner scan){
        int eigthteenLess=0,sixtyLess=0,aboveSixty=0;
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+(i+1)+" people age : ");
            int temp=scan.nextInt();
            arr[i]=temp;
            if(temp<18)eigthteenLess++;
            else if(temp<=60)sixtyLess++;
            else aboveSixty++;
        }
        Arrays.sort(arr);

        //print people's age
        System.out.println("Eighteen less age people's count : "+eigthteenLess);
        System.out.println("Eighteen to sixty age people's count : "+sixtyLess);
        System.out.println("above sixty age people's count : "+aboveSixty);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[10];
        countPeople(arr,scan);//input from user ten pepoles age
        scan.close();
    }
}