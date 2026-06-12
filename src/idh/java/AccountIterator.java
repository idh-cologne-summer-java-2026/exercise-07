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
		return this.currentPosition < ATM.size(); 
	}

	@Override
	public Account next() {
		Account nextAccount = this.Automat.getAccount(currentPosition); 
		currentPosition++; 
		return nextAccount;
	}

}
