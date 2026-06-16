package idh.java;

import java.util.Iterator;

public class AccounrIterator implements Iterator<Account> {
Account account;
int currentPosition = 0;
	public AccounrIterator(Account account){
		this.account = account;
		
	}
	
	@Override
	public boolean hasNext() {
		return this.currentPosition <account.size();
		return false;
	}

	@Override
	public Account next() {
		// TODO Auto-generated method stub
		return null;
	}

}
