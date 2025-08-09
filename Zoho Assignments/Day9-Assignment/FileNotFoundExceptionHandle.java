/*
Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileNotFoundExceptionHandle{
    public static void main(String[] args) {
        //file not found in your disk throw filenot found exception...
        File file=new File("myfile.txt");
        FileReader fr=null;
        try{
            file.createNewFile();
            FileWriter fw=new FileWriter(file);
            fw.write("tamil");
            fw.flush();
            fw.close();
            fr=new FileReader(file);
            //fr.close(); use achieve ioexception
            int ind=fr.read();
            while(ind!=-1){
                System.out.print((char)ind);
                ind=fr.read();
            }
        }
        catch(FileNotFoundException e){
            System.out.println("file not found Exception");
        }
        catch(IOException e){
            System.out.println("file Io Exception");
        }
        finally{
            //use finally block to close the reader handle io exception
            //fr.close();
        }
    }
}