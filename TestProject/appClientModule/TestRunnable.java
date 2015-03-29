
public class TestRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Runnable thread is running ....");
		
	}

	
	
	
	public static void main(String args[]) throws InterruptedException{
		
		TestRunnable runnable = new TestRunnable();
		Thread myThread1 = new Thread(runnable, "RUNNABLE-THREAD");
		myThread1.start();
		System.out.println("myThread : "+ myThread1.getName());
		
		Runnable runnable2  = new Runnable() {
				public void run(){
					System.out.println("Second Thread....");
				}};
		Thread myThread2 = new Thread(runnable2,"RUNNABLE-THREAD 22222");
		System.out.println("myThread : "+ myThread2.getName());
		myThread2.start();
		
		System.out.println("Current Thread : "+Thread.currentThread().getName());
		System.out.println("Out side thread");
	}
	
}

