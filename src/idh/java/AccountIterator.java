package idh.java;

import java.util.Iterator;

public class AccountIterator implements Iterator<Account> {

	Account[] accounts;
	int currentPosition = 0;
	
//	public AccountIterator (ATM atm) {
//		this.accounts = atm.accounts;
//	}
	
	public AccountIterator (Account[] accounts) {
		this.accounts = accounts;
	}
	
	public boolean hasNext() {
		return this.currentPosition < accounts.length;
	}

	public Account next() {
		Account account =  accounts[currentPosition++];
		return account;
	}

}
