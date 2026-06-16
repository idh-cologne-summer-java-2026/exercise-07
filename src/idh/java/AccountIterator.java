package idh.java;

import java.util.Iterator;

public class AccountIterator implements Iterator<Account> {

	private Account[] accounts;
	private int index = 0;

	public AccountIterator(ATM atm) {
		this.accounts = atm.accounts;
	}

	@Override
	public boolean hasNext() {
		return index < accounts.length;
	}

	@Override
	public Account next() {
		Account account = accounts[index];
		index++;
		return account;
	}

}
