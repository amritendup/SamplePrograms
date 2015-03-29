
public class UseOfThreadLocal implements Runnable {

	ThreadLocal tLocal = new ThreadLocal();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(Thread.currentThread().getName().equals("THREAD1")){
			tLocal.set("Thread Local Value for Thread 1");
		}else{
			tLocal.set("Thread Local Value for Thread 2");
		}
		
		
		showLocal();
	}
	
	public void showLocal(){
		System.out.println(tLocal.get());
	}
	
	public static void main(String args[]){
		
		UseOfThreadLocal runnable = new UseOfThreadLocal();
		 
		
		
		Thread t1 = new Thread(runnable, "THREAD1");
		
		Thread t2 = new Thread(runnable, "THREAD2");
		t1.start();
		t2.start();
	}
	

}
