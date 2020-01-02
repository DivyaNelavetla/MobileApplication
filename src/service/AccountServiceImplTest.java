package service;
import java.util.Map;
import org.junit.*;

import dao.AccountDaoImpl;
import entity.Account;
public class AccountServiceImplTest {
    @Test
	public void testCreateAccount_1(){
	AccountServiceImpl service=new AccountServiceImpl(new AccountDaoImpl());
	String mn="123456789";
	double bal=1000;
	String name="Divya";
	String accType="prepaid";
	Account a=service.createAccount(mn,name,bal,accType);
	Assert.assertNotNull(a);
	double resultBal=a.getBalance();
	Assert.assertEquals(bal, resultBal,0);
	Assert.assertEquals(name, a.getName());
	Map<String,Account> store=service.getDao().getStore();
	Account e=store.get(mn);
	Assert.assertNotNull(e);
	Assert.assertEquals(e, a);
	
	
	
	
	
	
	
	}
}
