/*
Write a program that illustrates the Explicit type casting for all data types?
*/
public class ExplicitTypeCasting{
    public static void main(String[] args) {
        double percentage=75.8;
        byte average=(byte)percentage;//Explicit type casting short to byte
        System.out.println(average);
        
        /*
        output :
        75

        Explicit type casting in Java, also known as narrowing conversion, is the process of manually converting a value from a larger data type to a smaller data type.
        This is necessary because the compiler cannot automatically perform such conversions due to the potential for data loss or precision loss
        */
    }
}
