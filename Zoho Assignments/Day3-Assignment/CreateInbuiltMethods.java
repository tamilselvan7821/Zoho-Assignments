/*
Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class.   
*/
import java.util.Scanner;
public class CreateInbuiltMethods{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String value=scan.nextLine();
        while(true){
            System.out.println("press 1 > call length()");
            System.out.println("press 2 > call charAt(int index)");
            System.out.println("press 3 > call equals(String other)");
            System.out.println("press 4 > call toUpperCase()");
            System.out.println("press 5 > call toLowerCase()");
            System.out.println("press 6 > call substring(int start, int end)");
            System.out.println("press 7 > call concat(MyString other)");
            System.out.println("press 8 > call contains(MyString sub)");
            System.out.println("press 9 > call indexOf(char ch)");
            System.out.println("press 10 > call replace(char oldChar, char newChar)");
            System.out.println("press 11 > Quit");
            System.out.print("Enter your Input : ");
            String input=scan.nextLine();
            switch (input) {
                case "1":System.out.println(MyString.length(value));break;
                case "2":System.out.println(MyString.charAt(scan,value));break;    
                case "3":System.out.println("Two string are "+MyString.equals(scan,value));break;
                case "4":System.out.println(value+" to Uppercase => "+MyString.toUpperCase(value));break;
                case "5":System.out.println(value+" to Lowercase => "+MyString.toLowerCase(value));break;
                case "6":System.out.println(value+" substring of "+MyString.substring(scan,value));break;
                case "7":System.out.println(value+" concate => "+MyString.concate(scan,value));break;
                case "8":System.out.println(value+" contains => "+MyString.contains(scan,value));break;
                case "9":System.out.println(value+" index of => "+MyString.indexOf(scan,value));break;
                case "10":System.out.println(value+" replace the word => "+MyString.replace(scan,value));break;
                case "11":System.out.println("-----Program Ended-----");return;    
                default:System.out.println("Please Enter Correct Input...");
            }
        }
    }
}
class MyString{
    static String replace(Scanner scan,String value){
        System.out.print("Enter the target value : ");
        char target=scan.nextLine().charAt(0);
        System.out.print("Enter the change value : ");
        char changes=scan.nextLine().charAt(0);
        char arr[]=value.toCharArray();
        for(int i=0;i<arr.length;i++){
            char temp=arr[i];
            if(temp==target)arr[i]=changes;
        }
        return new String(arr);
    }
    static int indexOf(Scanner scan,String value){
        System.out.print("Enter the value of char value  : ");
        char temp=scan.nextLine().charAt(0);
        int count=0;
        for(int i=0;i<value.length();i++){
            if(temp==value.charAt(i))break;
            count++;
        }
        if(count==value.length())return -1;
        return count;
    }
    static boolean contains(Scanner scan,String value){
        System.out.print("Enter the String : ");
        String temp=scan.nextLine();
        if(temp.length()>value.length())return false;
        for(int i=0;i<=(value.length()-temp.length());i++){
            char current=value.charAt(i);
            if(current==temp.charAt(0)){
                int ind=1;
                int start=i+1;
                while(ind<temp.length()&&start<value.length()){
                    if(value.charAt(start++)!=temp.charAt(ind++))break;
                }
                if(temp.length()==ind)return true;
            }
        }
        return false;
    }
    static String concate(Scanner scan,String value){
        System.out.print("Enter the Concate String : ");
        String temp=scan.nextLine();
        return new String(value+""+temp);
    }
    static String substring(Scanner scan,String value){
        System.out.print("Enter the start index : ");
        int start=scan.nextInt();
        System.out.print("Enter the end index : ");
        int end=scan.nextInt();scan.nextLine();
        if(start>end)return "index out of bounds Exception";
        if(start<0)return "index out of bounds Exception";
        int len=length(value);
        if(end>len)return "index out of bounds Exception";
        int chLength=end-start;
        char arr[]=new char[chLength];
        for(int i=0;i<chLength;i++){
            arr[i]=value.charAt(start++);
        }
        
        return new String(arr);
    }
    static String toLowerCase(String value){
        int len=length(value);
        char arr[]=value.toCharArray();
        for(int i=0;i<len;i++){
            if(arr[i]<'a'){
                arr[i]+=32;
            }
        }
        return new String(arr);
    }
    static String toUpperCase(String value){
        int len=length(value);
        char arr[]=value.toCharArray();
        for(int i=0;i<len;i++){
            if(arr[i]>'Z'){
                arr[i]-=32;
            }
        }
        return new String(arr);
    }
    static String equals(Scanner scan,String value){
        System.out.print("Enter the comparable String : ");
        String temp=scan.nextLine();
        if(value==null&&temp==null)return "equal";
        if(value==null||temp==null)return "not equal";
        if(length(value)==length(temp)){
            for(int i=0;i<length(value);i++){
                if(value.charAt(i)!=temp.charAt(i))return "not equal";
            }
        }
        else return "Not equal";
        return "equal";
    }
    static int length(String value){
        int count=0;
        try {
            while(true){
                value.charAt(count++);
            }
        } 
        catch (Exception e) {
            return count-1;
        }
    }
    static char charAt(Scanner scan,String value){
        System.out.print("Enter the index no : ");
        int ind=scan.nextInt();scan.nextLine();
        int len=length(value);
        if(ind>=len||ind<0){
            System.out.println("Index out of Bounds Exception");
            return ' ';
        }
        else{
            char arr[]=value.toCharArray();
            return arr[ind];
        }
    }
}