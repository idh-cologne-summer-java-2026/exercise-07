package idh.java;

import java.util.Iterator;

public class AccountIterator implements Iterator<Account> {
	ATM Automat; 
	int currentPosition = 0; 
	
	public AccountIterator(ATM Automat) {
		this.Automat = Automat; 
	}
	
	@Override
	public boolean hasNext() {
		return this.currentPosition < Automat.size(); 
	}
	@Override
	public Account next() {
	    Account nextAccount = Automat.accounts[currentPosition];
	    currentPosition++;
	    return nextAccount;
	}
}
