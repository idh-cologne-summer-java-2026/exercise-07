package idh.java;

import java.util.Iterator;

public class AccountIterator implements Iterator<Account> {

	// Array der Class Account aus Account.java
	Account[] accounts;
	// Erstes Element
	int currentPosition = 0;
	
	public AccountIterator(Account[] accounts ) {
		this.accounts = accounts;
	}

	@Override
	public boolean hasNext() {
		// Position (beginnt mit 0) muss kleiner aus Feldlänge sein (beginnt mit 1)
		return this.currentPosition < this.accounts.length ;
	}

	@Override
	public Account next() {
		// Rückt eine Position weiter
		currentPosition = currentPosition + 1;
		return accounts[currentPosition];
	}
}