/*
 Implement a basic producer-consumer problem using wait() and notify().
--->Producer thread should add items to a shared buffer.
--->Consumer thread should remove items.
Ensure the buffer size is limited to 5 items.. 
*/
import java.util.Scanner;
public class ProducerConsumerBuffer{
    static int buffer=5;
    public void addBuffer(){
        try{
            wait();
        }
        catch(Exception e){}
    }
    public void removeBuffer(){
        try{
            wait();
        }
        catch(Exception e){}
    }
    public static void main(String[] args)throws Exception{
        Scanner scan=new Scanner(System.in);
        ProducerConsumerBuffer shop=new ProducerConsumerBuffer();
        Thread consumer=new Thread(){
            public void run(){shop.removeBuffer();}
        };
        Thread producer=new Thread(){
            public void run(){shop.addBuffer();}
        };
        consumer.start();
        producer.start();
        while(true){
            System.out.println("press 1 > Producer");
            System.out.println("press 2 > Consumer");
            System.out.println("press 3 > Quit");
            System.out.print("Enter the input > ");
            String input=scan.nextLine();
            try{
            switch (input) {
                case "1":   if(shop.buffer==5){
                                System.out.println("buffer is full");
                                producer.wait();
                            }
                            else if(shop.buffer<5&&buffer>=0){
                                System.out.println("Buffer added...");
                                shop.buffer++;
                                producer.notify();
                            }
                            break;
                case "2":    if(shop.buffer==0){
                                System.out.println("buffer is empty");
                                consumer.wait();
                            }
                            else if(shop.buffer<=5&&buffer>=0){
                                System.out.println("Take it your Buffer");
                                shop.buffer--;
                                consumer.notify();
                            }
                            break; 
                case "3": System.out.println("-----program Ended-----");return;
                default:System.out.println("Invalid Input");
            }
            }
            catch(Exception e){}
        }
    }
}