package idh.java;

import java.util.Iterator;

public class AccountIterator implements Iterator<Account> {

	private Account[] accounts;
	private int position = 0;

	// Der Konstruktor bekommt das Array übergeben
	public AccountIterator(Account[] accounts) {
		this.accounts = accounts;
	}

	@Override
	public boolean hasNext() {
		// Prüft, ob wir das Ende des Arrays erreicht haben
		return position < accounts.length && accounts[position] != null;
	}

	@Override
	public Account next() {
		// Aktuelles Konto auslesen, Position um 1 erhöhen, Konto zurückgeben
		Account account = accounts[position];
		position++;
		return account;
	}
}