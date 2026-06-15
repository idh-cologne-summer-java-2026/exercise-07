package idh.java;

import java.util.Iterator;

public class AccountIterator implements Iterator<Account>{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account next() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		
		ATM atm = new ATM();
		
		Iterator<Account> it = atm.getAccountIterator();
		
		while(it.hasNext()) {
			Account currentAccount = it.next();
			System.out.println("Accountnummer: " + currentAccount);
		}
		
	}

}
