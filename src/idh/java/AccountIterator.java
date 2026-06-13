package idh.java;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class AccountIterator implements Iterator <Account>{
	
	private Account[] accounts; 
	private int currentIndex = 0; 

	
	// Konstruktor für Array aus ATM KLasse
	public AccountIterator(Account[] accounts) {
		
		
		this.accounts = accounts;
	}

	@Override
	public boolean hasNext() {
		
		// Prüfung, ob Index im Array-Bereich liegt und das Element nicht null ist
		return accounts != null && currentIndex < accounts.length;
	}

	@Override
	public Account next() {
		
		if (! hasNext()) {
			throw new NoSuchElementException("Keine weiteren Konten vorhanden.");
		}
		
		
		// Gibt das aktuelle Konto zurück und erhöht den Index um 1
		return accounts[currentIndex++];
	}

}