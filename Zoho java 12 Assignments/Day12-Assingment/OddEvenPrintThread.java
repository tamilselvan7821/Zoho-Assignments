/*
Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20.
Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...)
*/
public class OddEvenPrintThread{
	public static void main(String [] args){
		// crete two threads
		// MyThread evenPrint=new MyThread();
		// MyThread oddPrint=new MyThread();
		// change thread name because idetitifying the two threads
		// evenPrint.setName("Even");
		// oddPrint.setName("Odd");
		// evenPrint.start();
		// oddPrint.start();
		
		//Efficiency Method 
		OddPrintEvenPrint printing=new OddPrintEvenPrint();
		Thread t1=new Thread(new Runnable(){
			public void run(){printing.printOdd();}
			});
		Thread t2=new Thread(new Runnable(){
			public void run(){printing.printEven();}
			});
		t1.start();
		t2.start();
		System.out.println("-----Thread Terminated-----");
	}
}
//Alternative method
class MyThread extends Thread{
	public synchronized void run(){
		try{	
			for(int i=1;i<=20;i++){
				String name=Thread.currentThread().getName();
				if(i%2==0&&name.equals("Even"))System.out.println("Thread Name : "+name+"\tNumber :"+i);//print only even numbers
				if(name.equals("Odd")&&i%2==1)System.out.println("Thread Name : "+name+"\tNumber :"+i);//print only odd numbers
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){e.printStackTrace();}
	}
}
class OddPrintEvenPrint{
	static int count=1; 
	public synchronized void printOdd(){
		while(count<21){
			try{
				if((count)%2==1){
					System.out.println("Thread Name : "+Thread.currentThread().getName()+"\tNumber :"+count);count++;Thread.sleep(1000);
					notifyAll();
				}
				else wait();
			}
			catch(InterruptedException e){e.printStackTrace();}
		}
	}
	public synchronized void printEven(){
		while(count<21){
			try{
				if((count)%2==0){
					System.out.println("Thread Name : "+Thread.currentThread().getName()+"\tNumber :"+count);count++;Thread.sleep(1000);
					notifyAll();
				}
				else wait();
			}
			catch(InterruptedException e){e.printStackTrace();}
		}
	}
}



