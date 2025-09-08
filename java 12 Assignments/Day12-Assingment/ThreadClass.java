/*
Write a Java program to demonstrate multi-threading by extending the Thread class.
--->Create a class MyThread that extends Thread.
--->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds
between prints.
--->In the main() method, create two objects of MyThread and start them.
--->Each thread prints its message independently, showing concurrent execution.
*/
public class ThreadClass{
	public static void main(String [] args){
		//create thread using thread class
		MyThread thread1=new MyThread();
		MyThread thread2=new MyThread();
		//run threads use start() method
		thread1.start();
		thread2.start();
	}
}
class MyThread extends Thread{
	public void run(){
		try{	
			for(int i=0;i<5;i++){
				System.out.println("Thread Name : "+Thread.currentThread().getName()+"\tThread Id :"+Thread.currentThread().getId());
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){e.printStackTrace();}
	}
}

