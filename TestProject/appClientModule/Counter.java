
public class Counter {

	long count = 0;
    
    public  synchronized void add(long value){
    	System.out.println("Inside Counter : "+Thread.currentThread().getName());
    	System.out.println(Thread.currentThread().isInterrupted());
      this.count += value;
      System.out.println("Inside Counter : "+count);
      
    }
	
	
}
