import java.util.Scanner;
public class ColoumnNumberTOExcelSheet{
    private static String getTitle(int value){
        StringBuffer sb=new StringBuffer();
        while(value>0){
            value--;
            char cur=(char)((value%26)+65);
            sb.append(cur);
            value/=26;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Column Number : ");
        int value=scan.nextInt();
        System.out.println("Column Title : "+(getTitle(value)));
        scan.close();
    }
}