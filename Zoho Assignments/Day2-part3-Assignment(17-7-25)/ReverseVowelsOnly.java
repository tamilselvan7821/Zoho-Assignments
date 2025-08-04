import java.util.Scanner;
public class ReverseVowelsOnly{
    private static String reverseVowel(String str){
        char arr[]=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char lef=arr[left];
            char rig=arr[right];
            if((lef=='u'||lef=='o'||lef=='i'||lef=='e'||lef=='a'||lef=='U'||lef=='O'||lef=='I'||lef=='E'||lef=='A')&&(rig=='u'||rig=='o'||rig=='i'||rig=='e'||rig=='a'||rig=='U'||rig=='O'||rig=='I'||rig=='E'||rig=='A')){
                char temp=lef;
                arr[left]=rig;
                arr[right]=temp;
                left++;
                right--;
            }
            else if(lef=='u'||lef=='o'||lef=='i'||lef=='e'||lef=='a'||lef=='U'||lef=='O'||lef=='I'||lef=='E'||lef=='A')right--;
            else if(rig=='u'||rig=='o'||rig=='i'||rig=='e'||rig=='a'||rig=='U'||rig=='O'||rig=='I'||rig=='E'||rig=='A')left++;
            else {
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the input String : ");
        String input=scan.nextLine();
        System.out.println(reverseVowel(input));
        scan.close();
    }
}