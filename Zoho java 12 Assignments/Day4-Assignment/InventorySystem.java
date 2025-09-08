/*
Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables
and object containment.
Create two classes:
---Store
---Product
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
Task: Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
Also Check how many .class files are generated.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class InventorySystem{
    static void addProduct(Scanner scan){
        System.out.print("Product Name : ");
        String prName=scan.nextLine();
        System.out.print("Product Price : ");
        double prPrice=scan.nextDouble();
        System.out.print("Product Quantity : ");
        int prQuantity=scan.nextInt();scan.nextLine();
        Product temp=new Product(prName,prPrice,prQuantity);
        Store.addProduct(temp);
        System.out.println("----Successfully added your product----");
    }
    static void viewStore(){
        System.out.println();
        Store.displayStoreDetails();
        Store.displayAllProducts();
    }
    public static void main(String[] args) {
        //starting store name and  location in get of user
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your store Name : ");
        String stName=scan.nextLine();
        Store.storeName=stName;
        System.out.print("Enter Your store Location : ");
        String stLocation=scan.nextLine();
        Store.storeLocation=stLocation;
        System.out.println("----Successfully added your store----");
        while(true){
            System.out.println("press 1 => Add Product ");
            System.out.println("press 2 => Show Store");
            System.out.println("press 3 => Exit ");
            System.out.print("Enter user input > ");
            String input=scan.nextLine();
            switch(input){
                case "1" : addProduct(scan);break;//add product in store
                case "2" : viewStore();break;//view all products in the store
                case "3" :  System.out.println("-----Program Ended----");return;//return to exit program
                default : System.out.println("Please enter valid input...");
            }
        }
    }
}
class Store{
    static ArrayList<Product> products=new ArrayList<>();
    static String storeName;
    static String storeLocation;    

    public static void addProduct(Product product){
        products.add(product);
    }
    public static void displayStoreDetails(){
        System.out.println("Store Name : "+storeName+"\nStore Location : "+storeLocation+"\n");
    }
    public static void displayAllProducts(){
        if(products==null)System.out.println("Store is Empty Products...please add products...");
        else{
            for(Product ps:products){
                ps.displayProduct();
                System.out.println();
            }
        }
    }
}
class Product{
    private int productId;
    private String productName;
    private double productPrice;
    private static int increase=1;
    private int productQuantity;

    public void displayProduct(){
        System.out.println("Product Id : "+productId+"\nProduct Name : "+productName+"\nProduct Price : "+productPrice+"\nProduct Quantity : "+productQuantity);
    }

    public Product(String productName,double productPrice,int productQuantity) {
        this.productName=productName;
        this.productPrice=productPrice;
        this.productQuantity=productQuantity;
        productId=increase;
        increase++;
    }
    
}