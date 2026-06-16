package idh.java;

import java.util.Iterator;

public class AccountIterator implements Iterator<Account> {

	private Account[] accounts;
	private int index = 0;

	public AccountIterator(Account[] accounts) {
		this.accounts = accounts;
	}

	@Override
	public boolean hasNext() {
		return index < accounts.length;
	}

	@Override
	public Account next() {
		return accounts[index++];
	}

}
