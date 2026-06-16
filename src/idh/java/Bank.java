package idh.java;
import java.util.Iterator;
import java.util.Random;
import java.util.ArrayList;

public class Bank implements Iterable<Account>{

	//implementing an ArrayList because it seems better to me
	ArrayList<Account> accounts = new ArrayList<>();

	public Bank() {
		//just populate it with 10 random accounts to make testing easier
		// create accounts with varying balances
		
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			accounts.add(new Account(i, random.nextInt(1000)));
		}
	}

	//our inner iterator
	public class AcctIterator implements Iterator<Account>{

		private int index;

		public AcctIterator() {
			accounts = new ArrayList<Account>();
		}

		@Override
		public boolean hasNext() {
			if(index < accounts.size()) {
				return true;
			}
			return false;
		}

		@Override
		public Account next() {
			if(index < accounts.size())
				index++;
			return null;
		}	

	}

	@Override
	public Iterator<Account> iterator() {
		return new AcctIterator();
	}



}
