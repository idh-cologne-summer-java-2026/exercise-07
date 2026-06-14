package idh.java;

import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable <Account> {

	// Array of Accounts
	private Account[] accounts = new Account[5];
	
	// Das Array of Accounts wird gefüllt
	public Bank() {
		// Class Random wird initialisiert
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			// Füllen des Array of Accounts mit Zufallswerten
			// random.nextInt(1000)
			// Gibt einen pseudorandom, gleichmäßig verteilten int Wert zwischen 0 und 1000 zurück, 
			accounts[i] = new Account(i, random.nextInt(1000));
		}
	}

	//  Implementieren der iterator()-Methode für Class Account
	public Iterator<Account> iterator() {
		// Class AccountIterator with Array of Accounts
		// Damit werden auch hasNext() und next() initialisiert
		return new AccountIterator(this.accounts);
	}
	
}