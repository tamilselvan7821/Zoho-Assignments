/*
Write a Java program to read the contents of a text file and display it on the console
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ReadContentsOfFile{
    public static void main(String[] args) {
        //file select for my current java file
        File file=new File("ReadContentsOfFile.java");
        BufferedReader br=null;
        try {
            FileReader fr=new FileReader(file);
            br=new BufferedReader(fr);
            String temp=br.readLine();
            while(temp!=null){
                System.out.println(temp);//print line by line
                temp=br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}