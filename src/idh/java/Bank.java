package idh.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {

	ArrayList<Account> accounts = new ArrayList<Account>();

	public Bank() {
		accounts.add(new Account(5, 990));
		accounts.add(new Account(1, 200));
		accounts.add(new Account(221, 300));
		accounts.add(new Account(123, 400));

		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			accounts.add(new Account(i, random.nextInt(1000)));
		}
	}

	@Override
	public Iterator<Account> iterator() {
		return new BankIterator();
	}

	private class BankIterator implements Iterator<Account> {
		private int current = 0;

		@Override
		public boolean hasNext() {
			return current < accounts.size();
		}

		@Override
		public Account next() {
			return accounts.get(current++);
		}
	}
}
