/*
Write a Menu driven Java program a) to read content from the user and write it into another file and b) from the file
to another file c) to modify the content of a file d) to search for a particular word in a file and display how many times it
appears e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MenuDrivenProgramFileReadWrite{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ReaderAndWriter readWrite=new ReaderAndWriter(scan,"electronic.txt","mobiles.txt");
        while(true){
            System.out.println("press 1 > read the content and write the content another file");
            System.out.println("press 2 > change content one file to another file");
            System.out.println("press 3 > modify the content");
            System.out.println("press 4 > search paricular word and display count");
            System.out.println("press 5 > Read the content and copy them to the csv.file");
            System.out.println("press 6 > Quit");
            System.out.print("Enter input > ");
            String input=scan.nextLine();
            switch(input){
                case "1":readWrite.writeContent();break;
                case "2":readWrite.changeContent();break;
                case "3":readWrite.modifyContent();break;
                case "4":readWrite.searchContent();break;
                case "5":readWrite.copyCsvFile();break;
                case "6":System.out.println("-----program Ended-----");return;
                default:System.out.println("Invalid Input");
            }
        }
    }
}
class ReaderAndWriter{
    File electroFile;
    File mobileFile;
    BufferedWriter bw;
    FileWriter fr;
    FileReader fileReader;
    BufferedReader breader;
    Scanner scan;
    String electroMessage;
    String mobilMessage;
    public ReaderAndWriter(Scanner scan,String electro,String mobiles) {
        this.scan=scan;
        electroFile=new File(electro);
        mobileFile=new File(mobiles);
        try {
            electroFile.createNewFile();
            mobileFile.createNewFile();
            fr=new FileWriter(electroFile);
            bw=new BufferedWriter(fr);
            bw.write("List of Electronics Products");
            electroMessage="List of Electronics Products";
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void changeCsv(File file,String hint){
        try{
            fileReader=new FileReader(file);
            breader=new BufferedReader(fileReader);
            String temp=breader.readLine();
            String arr[]=temp.split("\\s+");
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<arr.length;i++){
                String current=(arr[i].contains(","))?"\""+arr[i]+"\"":arr[i];
                sb.append(current);
                if(i<arr.length-1)sb.append(",");
            }
            fr=new FileWriter(file);
            bw=new BufferedWriter(fr);
            if(hint.equals("mobile"))mobilMessage=sb.toString();
            else electroMessage=sb.toString();
            bw.write(sb.toString());
            bw.flush();
            System.out.println("file is : "+sb.toString());
        }
        catch(IOException e){e.printStackTrace();}
    }
    public void copyCsvFile(){
        while(true){
            System.out.println("press 1 > Electronics");
            System.out.println("press 2 > Mobiles");
            System.out.println("press 3 > Back");
            System.out.print("Enter input > ");
            String ins=scan.nextLine();
            String temp;
            switch(ins){
                case "1":System.out.print("Electronics Content : "+electroMessage);changeCsv(electroFile,"electro");break;
                case "2":System.out.print("Mobiles Content : "+mobilMessage);changeCsv(mobileFile,"mobile");break;
                case "3":return;
                default:System.out.println("Invaild input");
            }
        }
    }
    public void showContentCount(File file){
        System.out.print("Enter the search word : ");
        String search=scan.nextLine();
        if(search==null)showContentCount(file);
        try{
            fileReader=new FileReader(file);
            breader=new BufferedReader(fileReader);
            String temp=breader.readLine();
            String arr[]=temp.split("\\s+");
            int count=0;
            for(String a:arr)if(a.equals(search))count++;
            if(count==0)System.out.println(search+" no words in the file ");
            else System.out.println(search+" count of a words in the file : "+count);
        }
        catch(IOException e){e.printStackTrace();}
    }
    public void searchContent(){
        while(true){
            System.out.println("press 1 > Electronics");
            System.out.println("press 2 > Mobiles");
            System.out.println("press 3 > Back");
            System.out.print("Enter input > ");
            String ins=scan.nextLine();
            String temp;
            switch(ins){
                case "1":System.out.println("Electronics Content : "+electroMessage);showContentCount(electroFile);break;
                case "2":System.out.println("Mobiles Content : "+mobilMessage);showContentCount(mobileFile);break;
                case "3":return;
                default:System.out.println("Invaild input");
            }
        }
    }
    public void writeContent(){
        try{
            fileReader=new FileReader(electroFile);
            breader=new BufferedReader(fileReader);
            String temp=breader.readLine();
            System.out.print("Electronics product content : ");
            System.out.println(temp);
            System.out.print("You can write Mobiles content : ");
            String content=scan.nextLine();
            mobilMessage=content;
            fr=new FileWriter(mobileFile);
            bw=new BufferedWriter(fr);
            bw.write(content);
            bw.flush();
            System.out.println("sucessfully printed your content....\n");
        }
        catch(Exception e){e.printStackTrace();}
    }
    public void changeContent(){
        try {
            System.out.println("Electronics file content : "+electroMessage);
            System.out.println("mobiles file content : "+mobilMessage);
            System.out.println("After change : ");
            fr=new FileWriter(mobileFile);
            bw=new BufferedWriter(fr);
            String temp=mobilMessage;
            mobilMessage=electroMessage;
            bw.write(electroMessage);
            bw.flush();
            fr=new FileWriter(electroFile);
            bw=new BufferedWriter(fr);
            bw.write(temp);
            electroMessage=temp;
            bw.flush();
            System.out.println("Electronics file content : "+electroMessage);
            System.out.println("mobiles file content : "+mobilMessage+"\n");
        } catch (Exception e) {
        }
    }
    public void changeContent(String message,File fileName,String hint){
        try{
            fr=new FileWriter(fileName);
            bw=new BufferedWriter(fr);
            bw.write(message);
            bw.flush();
            if(hint.equals("electro"))electroMessage=message;
            else mobilMessage=message;
        }
        catch(Exception e){e.printStackTrace();}
    }
    public void modifyContent(){
        while(true){
            System.out.println("press 1 > Electronics");
            System.out.println("press 2 > Mobiles");
            System.out.println("press 3 > Back");
            System.out.print("Enter input > ");
            String ins=scan.nextLine();
            String temp;
            switch(ins){
                case "1":System.out.print("Enter new Content : ");temp=scan.nextLine();changeContent(temp,electroFile,"electro");break;
                case "2":System.out.print("Enter new Content : ");temp=scan.nextLine();changeContent(temp,mobileFile,"mobile");break;
                case "3":return;
                default:System.out.println("Invaild input");
            }
        }
    }
}