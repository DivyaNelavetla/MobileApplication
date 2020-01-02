
package dao;
import java.util.Map;
import java.util.Set;

import entity.Account;



public interface IAccountDao {

	void accountBalanceEnquiry(String a);
	void rechargeAccount(String mobileno);
	Set<Account> allAccounts();
	Account createAccount(String m, String name, double bal, String accType);
	public Map<String,Account> getStore();
	void addAccount(Account e);
	
}
