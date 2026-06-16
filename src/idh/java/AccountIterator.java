package idh.java;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class AccountIterator implements Iterator<Account> {
	ATM Automat; 
	int currentPosition = 0; 
	
	public AccountIterator(ATM Automat) {
		this.Automat = Automat; 
	}
	@Override 
	public boolean hasNext() {
		return currentPosition < Automat.getSize(); 
	}
	@Override 
	public Account next() {
		if(!hasNext()) {
			throw new NoSuchElementException(); 
		}
		Account newAccount = Automat.getAccount(currentPosition); 
		currentPosition++; 
		return newAccount; 
	}

}
