/*
Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
--->The console should reflect the concurrent execution of both tasks.
*/
public class RunnableInterface{
	public static void main(String [] args){
		//create thread using runnable interface
		Thread thread1=new Thread(new TaskRunner());
		Thread thread2=new Thread(new TaskRunner());
		//run threads use start() method
		thread1.start();
		thread2.start();
	}
}
class TaskRunner implements Runnable{
	public void run(){
		try{	
			for(int i=1;i<=10;i++){
				System.out.println("Thread Name : "+Thread.currentThread().getName()+"\tTask "+i+" completed");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){e.printStackTrace();}
	}
}



