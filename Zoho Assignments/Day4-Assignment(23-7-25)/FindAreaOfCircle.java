/*
A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file.
Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14
*/
import java.util.Scanner;
public class FindAreaOfCircle{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the x value : ");
        int x=scan.nextInt();
        System.out.print("Enter the y value : ");
        int y=scan.nextInt(); 
        System.out.print("Enter the Radius Value : ");
        int radius=scan.nextInt();
        Circle circle=new Circle();
        circle.setRadius(radius);
        circle.setPoints(x, y);
        circle.printPoints();
        circle.printRadius();
        circle.printArea();   
    }
}
class Point{
    private int x;
    private int y;
    public Point(){
        x=0;
        y=0;
    }
    public int getX(){
        return x;
    }
    public void setPoints(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getY(){
        return y;
    }
    public void printPoints(){
        System.out.println("Circle centre is : ("+x+","+y+")");
    }
}
class Circle extends Point{
    private int radius;
    private double area;
    public Circle(){
        radius=1;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public void printArea(){
        area=(double)22/7*radius*radius;
        System.out.printf("Area is : %.2f%n",area);
    }
    public void printRadius(){
        System.out.println("Radius is : "+radius);
    }
}