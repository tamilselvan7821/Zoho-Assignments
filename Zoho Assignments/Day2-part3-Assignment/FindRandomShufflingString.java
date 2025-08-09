import java.util.Scanner;
public class FindRandomShufflingString{
    private static char findRandomString(String t,String s){
        int total=0;
        for(int i=0;i<t.length();i++){
            total+=t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            total-=s.charAt(i);
        }
        return (char)total;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Input String : ");
        String input=scan.nextLine();
        System.out.print("Enter the Input Shuffling String : ");
        String shuffle=scan.nextLine();
        System.out.println(findRandomString(input,shuffle));//print output
        scan.close();
    }
}