package idh.java;

import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {

    Account[] accounts = new Account[5];


    public Bank() {

        Random random = new Random();

        for(int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, random.nextInt(1000));
        }
    }


    @Override
    public Iterator<Account> iterator() {
        return new AccountIterator();
    }


    private class AccountIterator implements Iterator<Account> {

        private int position = 0;


        public boolean hasNext() {
            return position < accounts.length;
        }


        public Account next() {
            Account account = accounts[position];
            position++;
            return account;
        }
    }
}