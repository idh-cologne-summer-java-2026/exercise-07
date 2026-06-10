package idh.java;

/**
 * This class represents an account in our bank.
 * 
 * @author reiterns
 *
 */
public class Account implements Iterable<> {
	// the balance of the account
	int balance;

	// the id of the account
	int id;

	public Iterator<> iterator() {
		return new AccountIterator<>(this);
	}

	public Account(int id, int status) {
		this.id = id;
		this.balance = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int status) {
		this.balance = status;
	}

	/**
	 * Withdraws a sum of money from the account
	 * 
	 * @param sum
	 */
	public void withdraw(int sum) {
		this.balance = balance - sum;
	}

}
