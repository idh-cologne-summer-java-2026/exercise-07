package idh.java;

import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {

	private final Account[] accounts;
	
	public Bank(int size) {
		accounts = new Account[size];
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
		}
	}
	
	public Iterator<Account> iterator() {
		return new AccountIterator();
	}
	
	//inner class AccountIterator
	private class AccountIterator implements Iterator<Account> {
		private int index = 0;

		public boolean hasNext() {
			return index < accounts.length;
		}


		public Account next() {
			return accounts[index++];
		}
		
	}

}
