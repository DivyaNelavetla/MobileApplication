package service;
import java.util.Map;
import java.util.Set;

import entity.Account;

public interface IAccountService {
	void accountBalanceEnquiry(String a);
	void rechargeAccount(String mobileno);
    Set<Account> allAccounts();
	Account createAccount(String m, String name, double bal, String accType);
	void addAccount(Account e);
	public Map<String,Account> getStore();
}
