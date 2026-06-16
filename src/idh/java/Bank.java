package idh.java;

import java.util.Iterator;
import java.util.Random;

// Durch "implements Iterable" erlauben wir die Nutzung in einer for-each-Schleife
public class Bank implements Iterable<Account> {

	// Die Bank verwaltet jetzt das Array der Konten
	private Account[] accounts = new Account[5];

	public Bank() {
		// Konten erstellen (das haben wir aus der ATM-Klasse hierher verschoben)
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
		}
	}

	// Diese Methode wird durch Iterable erzwungen
	@Override
	public Iterator<Account> iterator() {
		// Wir geben unseren in Aufgabe 1 gebauten Iterator zurück
		return new AccountIterator(this.accounts);
	}
}