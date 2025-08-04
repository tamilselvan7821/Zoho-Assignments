/*
Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"
*/
public class FindDistanceUseTwoDAndThreeeDPoints{
    public static void main(String[] args) {
        ThreeD firstPoint=new ThreeD();//call default constructor 
        firstPoint.setX(1);
        firstPoint.setY(2);
        firstPoint.setZ(3);
        ThreeD secondPoint=new ThreeD(4,5,6);//call two argumnet constructor
        int distance=firstPoint.findDistance(secondPoint);//two objects or two axis points distance 
        System.out.println("Two axis distance : "+distance);
    }
}
class TwoD{
    int x;
    int y;
    public TwoD(){
        System.out.println("TwoD default Constructor....");
    }
    public TwoD(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println("TwoD Constructor with two Arguments....");
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
}
class ThreeD extends TwoD{
    int z;
    public ThreeD(){}
    public ThreeD(int x,int y,int z){
        super(x,y);
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public int getZ(){
        return z;
    }
    public void setZ(int Z){
        this.z=z;
    }
    public int findDistance(ThreeD temp){
        int result=((temp.x-x)*(temp.x-x))+((temp.y-y)*(temp.y-y))+((temp.z-z)*(temp.z-z));
        return result;
    }
}