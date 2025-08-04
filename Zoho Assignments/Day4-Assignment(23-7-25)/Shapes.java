/*
Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.
*/
public class Shapes{
    public static void main(String[] args) {
        //create all instance of a shapes
        Shape shape=new Shape();
        Polygon polygon=new Polygon();
        Rectangle rectangle=new Rectangle();
        Triangle triangle=new Triangle();
        Square square=new Square();
        //print all shapes
        shape.printShape();
        polygon.printShape();
        rectangle.printShape();
        triangle.printShape();
        square.printShape();

    }
}
class Shape{
    void printShape(){
        System.out.println("This is a Shape");
    }
}
class Polygon extends Shape{
    void printShape(){
        System.out.println("Polygon is a Shape");
    }   
}
class Rectangle extends Polygon{
    void printShape(){
        System.out.println("Rectangle is a Polygon");
    }
}
class Triangle extends Polygon{
    void printShape(){
        System.out.println("Triangle is a Polygon");
    }
}
class Square extends Rectangle{
    void printShape(){
        System.out.println("Square is a Rectangle");
    }
}