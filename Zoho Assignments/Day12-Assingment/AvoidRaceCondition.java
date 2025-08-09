/*
Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times.
Use synchronization to avoid race conditions and display the final value.
*/
public class AvoidRaceCondition{
    static int count=0; 
    public static void increaseCount(){
            count++;
    }
    public static void main(String[] args) throws InterruptedException{
        MyThread task1=new MyThread();
        SecondMyThread task2=new SecondMyThread();
        ThirdMyThread task3=new ThirdMyThread();
        task1.setName("Task1");
        task2.setName("Task2");
        task3.setName("Task3");
        task1.start();
        task2.start();
        task3.start();
        //join use to control the race condition one thread execute to next another thread run
        task1.join();
        task2.join();
        task3.join();
        System.out.println("Final value count : "+count);
    }
}
class MyThread extends Thread{
    @Override
    public void run(){System.out.println(
        Thread.currentThread().getName());
        for(int i=1;i<=1000;i++)AvoidRaceCondition.increaseCount();
    }
}
class SecondMyThread extends Thread{
    @Override
    public void run(){System.out.println(
        Thread.currentThread().getName());
        for(int i=1;i<=1000;i++)AvoidRaceCondition.increaseCount();
    }
}
class ThirdMyThread extends Thread{
    @Override
    public void run(){System.out.println(
        Thread.currentThread().getName());
        for(int i=1;i<=1000;i++)AvoidRaceCondition.increaseCount();
    }
}