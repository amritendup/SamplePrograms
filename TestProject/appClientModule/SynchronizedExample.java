
public class SynchronizedExample extends Thread {

	protected Counter counter = null;

    public SynchronizedExample(Counter counter){
       this.counter = counter;
    }

    public void run() {
    	System.out.println(Thread.currentThread().getName());
    	
	for(int i=0; i<3; i++){
          counter.add(i);
       }
	
	System.out.println("Inside thread Counter : "+Thread.currentThread().getName()+" ::: "+counter.count);
    }
    
    
    
    public static void main(String args[]) throws InterruptedException{
    	
    	Counter counter = new Counter();
    	Counter counterA = new Counter();
    	Counter counterB = new Counter();
        Thread  threadA = new SynchronizedExample(counter);
        Thread  threadB = new SynchronizedExample(counter);

        threadA.start();
        counter.count+=5;
        threadB.start(); 
        System.out.println("THread count : "+ Thread.activeCount());
        //Thread.sleep(1000);
        //threadB.sleep(10000);
        //if(!threadA.isAlive() && !threadB.isAlive()) {
        System.out.println("Counter : "+counter.count);
        
        System.out.println("CounterA : "+counterA.count);
        
        System.out.println("CounterB : "+counterB.count);
        //}
    	
    	
    }
	
	
}
