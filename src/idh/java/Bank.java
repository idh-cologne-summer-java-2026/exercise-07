package idh.java;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	
	private Account[] accounts = new Account[5];
	
	public Bank() {
		Random random = new Random();
		
		for(int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			
		}
	}
	
	@Override 
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	/**
	 * Demonstrates iteration using a while-loop with Iterator
	 */
	public void printAllAccounts() {
		Iterator<Account> iterator = iterator();
		while(iterator.hasNext()) {
			Account account = iterator.next();
			System.out.println("Account ID: " + account.getId() + ", Balance: " + account.getBalance());
		}
	}

}
