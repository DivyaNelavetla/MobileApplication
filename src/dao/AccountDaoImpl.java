package dao;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import entity.Account;
import exceptions.AccountAlreadyExistsException;
import exceptions.MobileNoNotFoundException;




public class AccountDaoImpl implements IAccountDao {

	private Map<String, Account> m = new HashMap<>();

	@Override
	public void accountBalanceEnquiry(String a) {
		if (m.containsKey(a)) {
			Account a1=m.get(a);
			System.out.println(a1.getBalance());
		} else
			throw new MobileNoNotFoundException("The Mobile number " + a + "does not found");
	}

	@Override
	public void rechargeAccount(String mobileno) {

		if (m.containsKey(mobileno)) {
			System.out.println("Amount to be Recharged");
			Scanner sc = new Scanner(System.in);
			int amt = sc.nextInt();
			Account a = m.get(mobileno);
			a.setBalance(a.getBalance() + amt);
			m.put(a.getMobileno(), a);
			

		} else {
			throw new MobileNoNotFoundException("The Mobile number " + mobileno + "does not found");
		}

	}
	@Override
	public void addAccount(Account e) {
		m.put(e.getMobileno(), e);
	}

	/*
	 * @Override Set<Account> allAccounts() { // TODO Auto-generated method stub
	 * Collection<Account> a = m.values(); Set<Account> accountSet = new
	 * HashSet<>(a); return; }
	 */
	@Override
	public Account createAccount(String m1, String name, double bal, String accType) {

		if (m.containsKey(m1))
			throw new AccountAlreadyExistsException("Account already exists for this Mobile number");
		else {
			Account a = new Account(m1, name, bal, accType);
			m.put(m1, a);
			return a;
		}
	}


	public Set<Account> allAccount() {
		Collection<Account> customer = m.values();
		Set<Account> customerSet = new HashSet<>(customer);
		return customerSet;
	}

	@Override
	public Set<Account> allAccounts() {
		Collection<Account> customer = m.values();
		Set<Account> customerSet = new HashSet<>(customer);
		return customerSet;// TODO Auto-generated method stub
		
	}
	public Map<String,Account> getStore(){
		return m;
	}
	

}
