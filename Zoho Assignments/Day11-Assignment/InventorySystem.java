/*
Design a Java application to manage a product inventory system using file handling and object serialization.
Create a class Product with the following attributes:
--->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
--->Add a Product: Accept product details from the user and write the object to a file (products.dat).
--->View All Products: Read all product objects from the file and display them.
--->Search Product by ID: Search for a product by productId in the file and display its details if found.
--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to
the file.
--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and
efficiently.
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class InventorySystem{
    static final String file="store.dat";
    static Scanner scan=new Scanner(System.in);
    
    static ArrayList<Product> readProduct(){
        File myfile=new File(file);
        ArrayList<Product> sent=new ArrayList<>();
        try {
            ObjectInputStream oi=new ObjectInputStream(new FileInputStream(myfile));
            sent=(ArrayList<Product>)oi.readObject();
        } catch (Exception e) {
            return sent;
        }
        return sent;
    }
    static void writeProduct(ArrayList<Product> product){
        try {
            ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(file));
            os.writeObject(product);
        } catch (Exception e) {
        }
    }
    static void addProduct(){
        System.out.print("Product Name : ");
        String prName=scan.nextLine();
        System.out.print("Product Id : ");
        int prId=scan.nextInt();
        System.out.print("Product Quantity : ");
        int prQuantity=scan.nextInt();
        System.out.print("Product Price : ");
        double prPrice=scan.nextDouble();scan.nextLine();
        Product temp=new Product(prName,prPrice,prQuantity,prId);
        ArrayList<Product>storeList=readProduct();
        try {
            storeList.add(temp);
            writeProduct(storeList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("----Successfully added your product----\n");
    }
    static void viewStore(){
        ArrayList<Product>store=readProduct();
        if(store==null){
            System.out.println("Store is empty.....");
            return;
        }
        System.out.println("Products : ");
        for(Product pr:store)System.out.println(pr);
    }
    static void searchProduct(){
        ArrayList<Product>store=readProduct();
        if(store==null){
            System.out.println("Store is empty.....");
            return;
        }
        System.out.print("Enter product Id : ");
        int id=scan.nextInt();scan.nextLine();
        boolean ch=true;
        for(Product pr:store){
            if(pr.getProductId()==id){
                System.out.println(pr);
                ch=false;
                break;
            }
        }
        if(ch)System.out.println("Product not exits...");
    }
    static void updateProduct(){
        ArrayList<Product>store=readProduct();
        if(store==null){
            System.out.println("Store is empty.....");
            return;
        }
        System.out.print("Enter product Id : ");
        int id=scan.nextInt();scan.nextLine();
        boolean ch=true;
        for(Product pr:store){
            if(pr.getProductId()==id){
                System.out.println("press 1 > change product Id");
                System.out.println("press 2 > change product Name");
                System.out.println("press 3 > change product Price");
                System.out.println("press 4 > change product Quantity");
                System.out.println("press 5 > Back");
                System.out.print("Enter Input : ");
                String ins=scan.nextLine();
                switch(ins){
                    case "1":System.out.print("Enter product Id : ");int prId=scan.nextInt();scan.nextLine();
                            pr.setProductId(prId);break;
                    case "2":System.out.print("Enter product Name : ");String name=scan.nextLine();
                            pr.setProductName(name);System.out.println("sucessfully updated");break;
                    case "3":System.out.print("Enter product Price : ");double price=scan.nextDouble();scan.nextLine();
                            pr.setProductPrice(price);;System.out.println("sucessfully updated");break;
                    case "4":System.out.print("Enter product Quantity : ");int quantity=scan.nextInt();scan.nextLine();
                            pr.setProductQuantity(quantity);System.out.println("sucessfully updated");break;
                    case "5":return;
                    default :System.out.println("Invalid Input...");
                }
                ch=false;
                break;
            }
        }
        if(ch)System.out.println("Product not exits...");
        else{
            System.out.println("Product sucessfully updated");
            writeProduct(store);
        }
    }
    static void removeProduct(){
        ArrayList<Product>store=readProduct();
        if(store==null){
            System.out.println("Store is empty.....");
            return;
        }
        System.out.print("Enter product Id : ");
        int id=scan.nextInt();scan.nextLine();
        boolean ch=true;
        for(Product pr:store){
            if(pr.getProductId()==id){
                store.remove(pr);
                ch=false;
                break;
            }
        }
        if(ch)System.out.println("Product not exits...");
        else{
            System.out.println("Product sucessfully removed");
            writeProduct(store);
        }
    }
    public static void main(String[] args) {
        while(true){
            System.out.println("press 1 => Add Product ");
            System.out.println("press 2 => Show Products");
            System.out.println("press 3 => Search Products");
            System.out.println("press 4 => Update Products");
            System.out.println("press 5 => Remove Products");
            System.out.println("press 6 => Exit ");
            System.out.print("Enter user input > ");
            String input=scan.nextLine();
            switch(input){
                case "1" : addProduct();break;//add product in store
                case "2" : viewStore();break;//view all products in the store
                case "3" : searchProduct();break;//search by specified product
                case "4" : updateProduct();break;//update product
                case "5" : removeProduct();break;//remove product
                case "6" :  System.out.println("-----Program Ended----");return;//return to exit program
                default : System.out.println("Please enter valid input...");
            }
        }
    }
}
class Product implements Serializable{
    private int productId;
    private String productName;
    private double productPrice;
    private int productQuantity;

    public Product(String productName,double productPrice,int productQuantity,int productId) {
        this.productName=productName;
        this.productPrice=productPrice;
        this.productQuantity=productQuantity;
        this.productId=productId;
    }
    public String toString(){
        return "Product Id : "+productId+" Product Name : "+productName+" Product price : "+productPrice+" Product Quantity : "+productQuantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

}