package idh.java;

import java.util.Iterator;

public class AccountIterator implements Iterator<Account> {
	
	Bank bank;
	int currentPosition = 0;

	public AccountIterator(Bank bank) {
		this.bank = bank;
	}

	@Override
	public boolean hasNext() {
		return currentPosition < bank.accounts.length;
	}

	@Override
	public Account next() {
		Account a = this.bank.accounts[currentPosition];
		currentPosition++;
		return a;
	}

}
