/*
Write a Java program to append a text read from the user to an existing file without overwriting the original content
*/
import java.io.*;
public class AppendFileWithoutOverriding{
    public static void main(String[] args) {
        File file=new File("student.txt");
        try {
            file.createNewFile();
            FileWriter fr=new FileWriter(file,true);//append the details with original content.without overriding 
            BufferedWriter br=new BufferedWriter(fr);
            br.write("Name : tamil\t Rollno : 65677\n");
            br.close();
        } catch (Exception e) {e.printStackTrace();}
    }
}