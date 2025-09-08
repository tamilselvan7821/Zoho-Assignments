import java.util.Scanner;
public class StudentsRollNoMarkPrint{
    private static void getDetails(int arr[][],Scanner scan){
        for(int i=0;i<arr.length;i++){
            int tot=0;
            for(int j=0;j<4;j++){
                if(j==0){
                    System.out.print("Enter the "+(i+1)+" Person Roll no : ");
                    arr[i][j]=scan.nextInt();
                }
                else if(j>0){
                    String temp;
                    if(j==1)temp="Tamil";
                    else if(j==2)temp="English";
                    else temp="Maths";
                    System.out.print("Enter the "+temp+" subject Mark : ");
                    int current=scan.nextInt();  
                    arr[i][j]=current;
                    tot+=current;
                }
            }
            arr[i][4]=tot;
            arr[i][5]=tot/3;
            System.out.println();
        }
    }
    private static void printDetails(int arr[][]){
        System.out.println("-------------------------------------------------------");
        System.out.println("| Roll.no | Tamil | English | Maths | Total | Average | ");
        System.out.println("-------------------------------------------------------");
        for(int i=0;i<arr.length;i++){
            System.out.printf("|   %-5d |   %-4d|   %-4d  |  %-4d |  %-4d |  %-4d   |%n",arr[i][0],arr[i][1],arr[i][2],arr[i][3],arr[i][4],arr[i][5]);
            System.out.println("-------------------------------------------------------");
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[][]=new int[3][6];
        getDetails(arr,scan);//get user marks
        printDetails(arr);//print mark in all students
        scan.close();
    }
}