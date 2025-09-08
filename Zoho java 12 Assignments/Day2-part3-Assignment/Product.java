import java.io.*;
public class Product implements Serializable{
    int productId;
    String productName;
    int productCount;
    double productPrice;
    Product(int productId,String productName,int productCount,double productPrice){
        this.productId=productId;
        this.productName=productName;
        this.productCount=productCount;
        this.productPrice=productPrice;
    }
    public String toString(){
        return ("Product Id : "+productId+"\nProduct Name : "+productName+"\nProduct Count : "+productCount+"\nProduct Price : "+productPrice+"\n");
    }
    public static void main(String[] args) throws IOException,FileNotFoundException,ClassNotFoundException{
        Product shirt=new Product(1,"Red Shirt",10,500.55);
        System.out.println(shirt);
        FileOutputStream fileOut=new FileOutputStream("product.txt");
        ObjectOutputStream objectOut=new ObjectOutputStream(fileOut);
        objectOut.writeObject(shirt);
        objectOut.close();
        fileOut.close();
        System.out.println("serializable has been done...\n");
        
        Product empty=null;
        FileInputStream fileIn=new FileInputStream("product.txt");
        ObjectInputStream objectInt=new ObjectInputStream(fileIn);
        empty=(Product) objectInt.readObject();
        objectInt.close();
        fileIn.close();
        System.out.println("De-serializable has been done...");
        System.out.println("Empty Object");
        System.out.println(empty);
    }
}