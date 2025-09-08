import java.util.Scanner;
public class UsageOfCapitals{
    private static boolean checkCase(String str){
        //intialize threee cases boolean values
        boolean small=false,capital=false,first=false;
        char firstChar=str.charAt(0);
        if(firstChar>='a'&&firstChar<='z')small=true;
        if(str.length()>1){
            if(!small){
                if(str.charAt(1)>='A'&&str.charAt(1)<='Z')capital=true;
                else first=true;
            }
        }
        for(int i=1;i<str.length();i++){
            char temp=str.charAt(i);
            if(first&&(temp>='A'&&temp<='Z'))return false;
            if(temp<'a'&&small)return false;
            if((temp>='a'&&temp<='z')&&capital)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String :");
        String str=scan.nextLine();
        boolean result=checkCase(str);//check all Letters
        if(result)System.out.println("The string is valid");
        else System.out.println("The string is Invalid");
    }
}