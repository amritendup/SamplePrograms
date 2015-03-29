
public class Transaction {

	 double accountA = 1000.00;
	 double accountB = 1000.00;
	
	public synchronized void transfer(double amount){
		if(amount>accountA)
			return;
		accountA -= amount;
		accountB+= amount;
	}
	
	public double getTotal(){
		return accountA+accountB;
	}
	
	
}
