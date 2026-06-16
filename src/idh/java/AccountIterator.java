package idh.java;
import java.util.Iterator;

public class AccountIterator implements Iterator<Account>{

	private int index;
	private Account[] accounts;
	
	public AccountIterator(ATM atm) {
		accounts = atm.accounts;
	}
	
	@Override
	public boolean hasNext() {
		if(index < accounts.length) {
			return true;
		}
		return false;
	}

	@Override
	public Account next() {
		if(index < accounts.length)
			index++;
		return null;
	}	
	
}
