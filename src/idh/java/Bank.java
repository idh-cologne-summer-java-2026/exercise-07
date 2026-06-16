package idh.java;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class Bank implements Iterable<Account> {

    private final Account[] accounts = new Account[5];

    public Bank() {
        Random random = new Random();
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, random.nextInt(1000));
        }
    }

    @Override
    public Iterator<Account> iterator() {
        return new BankIterator();
    }

    private class BankIterator implements Iterator<Account> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < accounts.length && accounts[currentIndex] != null;
        }

        @Override
        public Account next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return accounts[currentIndex++];
        }
    }
}
