package idh.java;

import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {

	
	Account[] accounts = new Account[5];
	
	public Bank() {
		
		//put money in the accounts
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i+1, random.nextInt(1000));
		}
		
	}
	
	
	public Account getAccount(int id) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getId() == id)
				return accounts[i];
		}
		return null;
	}
	
	@Override
	public Iterator<Account> iterator() {
		//implement
		return null;
	}

}
