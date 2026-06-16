package idh.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ATM {

	// initial cash in the ATM
	int cash = 100;

	// Referenz auf die Bank (anstelle des Arrays)
	Bank bank;

	// Der Konstruktor bekommt jetzt die Bank übergeben
	public ATM(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				System.out.print("Enter your account number: ");
				int accountNumber = Integer.parseInt(br.readLine());
				System.out.print("Enter the amount to withdraw: ");
				int amount = Integer.parseInt(br.readLine());
				cashout(accountNumber, amount);
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public void cashout(int accountNumber, int amount) {
		// check for cash in the ATM
		if (amount > cash) {
			System.out.println("Sorry, not enough cash left.");
			return;
		}

		// check for existence of the account
		Account account = getAccount(accountNumber);
		if (account == null) {
			System.out.println("Sorry, this account doesn't exist.");
			return;
		}

		// check for balance of the account
		if (amount > account.getBalance()) {
			System.out.println("Sorry, you're out of money.");
			return;
		}

		// withdraw
		account.withdraw(amount);
		cash -= amount;
		System.out.println("Ok, here is your money, enjoy!");
	}

	/**
	 * Launches the ATM
	 */
	public static void main(String[] args) {
		// 1. Zuerst die Bank gründen (die erstellt intern die Konten)
		Bank meineBank = new Bank();
		
		// 2. Den Automaten aufstellen und ihm sagen, zu welcher Bank er gehört
		ATM atm = new ATM(meineBank);
		
		// 3. Automaten starten
		atm.run();
	}

	/**
	 * Retrieves the account given an id.
	 * * @param id
	 * @return
	 */
	protected Account getAccount(int id) {
		// LÖSUNG FÜR AUFGABE 2: Die for-each Schleife mit Doppelpunkt!
		// Das funktioniert automatisch, weil die Klasse Bank "Iterable" implementiert.
		for (Account currentAccount : bank) {
			if (currentAccount.getId() == id) {
				return currentAccount;
			}
		}
		
		return null;
	}

}