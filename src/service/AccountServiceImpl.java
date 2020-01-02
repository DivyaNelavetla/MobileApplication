package service;

import java.util.Map;
import java.util.Set;

import dao.IAccountDao;
import entity.Account;

public class AccountServiceImpl implements IAccountService {

	private IAccountDao dao;

	public AccountServiceImpl(IAccountDao dao) {
		this.dao = dao;
	}

	public void accountBalanceEnquiry(String a) {
		dao.accountBalanceEnquiry(a);
	}

	public void rechargeAccount(String mobileno) {
		dao.rechargeAccount(mobileno);

	}

	public void addAccount(Account e) {
		dao.addAccount(e);
	}

	public Set<Account> allAccounts() {

		Set<Account> e = dao.allAccounts();
		return e;
	}

	public Account createAccount(String m, String name, double bal, String accType) {
		Account a = dao.createAccount(m, name, bal, accType);
		return a;

	}

	public IAccountDao getDao() {
		return dao;
	}

	public void setDao(IAccountDao dao) {
		this.dao = dao;
	}

	public Map<String,Account> getStore(){
		Map<String,Account> m2=dao.getStore();
		return m2;
	}

}
