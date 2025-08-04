import java.util.Scanner;
public class MenuDrivenProgram{
    static int total=0;
    private static void getInput(int arr[][],Scanner scan){
        for(int i=0;i<arr.length-1;i++){
            int rowTotal=0;
            for(int j=0;j<arr[i].length-1;j++){
                System.out.print("Enter Value arr["+i+"]["+j+"] value : ");
                int temp=scan.nextInt();
                arr[i][j]=temp;
                total+=temp;
                rowTotal+=temp;
                arr[arr.length-1][j]+=temp;
            }
            arr[i][arr[i].length-1]=rowTotal;
        }
        System.out.println("Sucessfully added all Elements....\n");

        scan.nextLine();
    }
    private static void printElementsRow(int arr[][]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print("|");
            for(int j=0;j<arr[i].length;j++){
                if(j==arr[i].length-1) System.out.print(" Total of => "+arr[i][j]+" |");
                else System.out.print(" "+arr[i][j]+" |");
            }
            System.out.println("");
        }
    }
    private static void printElementsColoumn(int arr[][]){
        System.out.print("Total of :\n|");
        for(int i=0;i<arr[0].length-1;i++){
            System.out.print(" "+arr[arr.length-1][i]+" |");
        }
        System.out.println();
    }
    private static void printArray(int arr[][]){
        System.out.println("Current Array : ");
        for(int i=0;i<arr.length-1;i++){
            System.out.print("|");
            for(int j=0;j<arr[i].length-1;j++){
                System.out.print(" "+arr[i][j]+" |");
            }
            System.out.println();
        }    
    }
    private static void transposeMatrix(int arr[][]){
        System.out.println("Transpose Array : ");
        for(int i=0;i<arr[0].length-1;i++){
            System.out.print("|");
            for(int j=0;j<arr.length-1;j++){
                System.out.print(" "+arr[j][i]+" |");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the No.Rows : ");
        int row=scan.nextInt();
        System.out.print("Enter the No.Columns : ");
        int column=scan.nextInt();   
        int arr[][]=new int[row+1][column+1];
        System.out.println();
        scan.nextLine();
        while(true){
            System.out.println("prees 1 > Input All Elements");
            System.out.println("press 2 > Display All Elements");
            System.out.println("press 3 > Display Sum of All Elements");
            System.out.println("press 4 > Display Row wise sum of Elements");
            System.out.println("press 5 > Display Column wise sum of Elements");
            System.out.println("press 6 > Display Transpose of Matrix");
            System.out.println("press 7 > Quit");
            System.out.print("Enter the Input : ");
            String input=scan.nextLine();
            switch(input){
                case "1" : getInput(arr,scan);break;
                case "2" : printArray(arr);break;
                case "3" : System.out.println("Sum Of All Elments : "+total);break;
                case "4" : printElementsRow(arr);break;
                case "5" : printArray(arr);printElementsColoumn(arr);break;
                case "6" : transposeMatrix(arr);break;
                case "7" : return;
                default : System.out.println("Please Enter Correct Input.....");
            }
        }    
    }
}