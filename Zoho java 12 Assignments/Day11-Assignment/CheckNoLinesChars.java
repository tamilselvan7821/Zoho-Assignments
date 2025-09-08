/*
Write a Java program that reads a file and prints the number of lines, words, and characters
*/
import java.io.*;
public class CheckNoLinesChars{
    public static void main(String[] args) {
        File file=new File("CheckNoLinesChars.java");
        try {
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            int noLines=0;
            int noChars=0;
            int noWords=0;
            String currentLine=br.readLine();
            while(currentLine!=null){
                noLines++;
                noChars+=currentLine.length();
                String arr[]=currentLine.split("\\s+");
                noWords+=arr.length;
                currentLine=br.readLine();
            }
            System.out.println("No line : "+noLines+"\tNo of words : "+noWords+"\tNo of chars : "+noChars);
        }
        catch (Exception e) {e.printStackTrace();}
    }
}