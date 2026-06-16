package idh.java;

import java.util.List;
import java.util.ArrayList; 

public class Bank {
   private List<Account> accounts; 
   public Bank() {
	   accounts = new ArrayList<>(); 
   }
   public void addAccounts(Account account) {
	   accounts.add(account); 
   }
   
   public Account findAccount(int id) {
	   for(Account account: accounts) {
		   if(account != null && account.getId()==id) {
			   return account; 
		   }
	   }
	   return null; 
   }
}
