package idh.java;

import java.util.Iterator; 

public class AccountIterator implements Iterator<Account>{
	
	private Account [] accounts; 
	private int index = 0; 
	
	public AccountIterator(ATM atm) { 
		this.accounts = atm.getAccounts(); 
	}
	
	@Override
	public boolean hasNext( ) { 
		
		return true; 
	}
	
	@Override
	public Account next () { 
		 
		Account current = accounts[index]; 
		 
		 index++; 
		
		 return current; 
	}
}
