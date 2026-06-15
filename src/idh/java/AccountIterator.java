package idh.java;

import java.util.Iterator;

public class AccountIterator implements Iterator<Account> {

    private ATM atm;
    private int position = 0;

    public AccountIterator(ATM atm) {
        this.atm = atm;
    }

    public boolean hasNext() {
        return position < atm.accounts.length;
    }

    public Account next() {
        Account account = atm.accounts[position];
        position++;
        return account;
    }
}