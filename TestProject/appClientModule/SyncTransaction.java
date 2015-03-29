


public class SyncTransaction implements Runnable{
	
	public Transaction trans = null;
	
	public SyncTransaction(Transaction aTrans){
		this.trans = aTrans;
	}
	

	public void run(){
		System.out.println(Thread.currentThread());
		
		trans.transfer(Math.random()*1000);
		//trans.transfer(300.0);
		
	}
	
	
	
	public static void main(String args[]){
		
		
		Transaction aTrans = new Transaction();
		SyncTransaction sync = new SyncTransaction(aTrans);
		
		for(int i=0;i<100;i++){
			
			Thread thread = new Thread(sync);
			thread.start();
			System.out.println(aTrans.getTotal());
			
		}
	}
	
}
