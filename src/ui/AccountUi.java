package ui;
import java.util.Scanner;
import java.util.Set;

import dao.AccountDaoImpl;
import entity.Account;
import service.AccountServiceImpl;


public class AccountUi {
	private AccountServiceImpl service = new AccountServiceImpl(new AccountDaoImpl());
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        AccountUi ui = new AccountUi();
        ui.runUi();
    }
    public void runUi() {
    	 Account a1 = new Account("1234", "A", 10,"prepaid");
    	 Account a2 = new Account("2345", "C", 10,"postpaid");
    	 Account a3 = new Account("123456", "B", 10,"postpaid");
    	 Account a4 = new Account("12345678", "D", 10,"prepaid");
    	 service.addAccount(a1);
    	 service.addAccount(a2);
    	 service.addAccount(a3);
    	 service.addAccount(a4);
    	System.out.println("Main Menu");
    	System.out.println("Select option for"
    			+ "1. Account Balance Enquiry "
    			+ "2.Recharge Account "
    			+ "3.Create Account "
    			+ "4.Exit ");
    	int Option = sc.nextInt();
    	if(Option==1) {
    		System.out.println("1. Account Balance Enquiry ");
    		System.out.println("Enter your Mobile number");
    		String mobileno = sc.next();
    		System.out.println("Balance is: ");
    		service.accountBalanceEnquiry(mobileno);
    	}
    	else if(Option==2) {
    		System.out.println("2.Recharge Account");
    		System.out.println("Enter your Mobile number");
    		String mobileno = sc.next();
    		
    		service.rechargeAccount(mobileno);
    		System.out.println("Balance is: ");
    		service.accountBalanceEnquiry(mobileno);
    	}
    	else if(Option==3)
    	{
    		System.out.println("Enter details for Account Creation");
    		System.out.println("Mobileno:");
    		String mobileno = sc.next();
    		System.out.println("name:");
    		String name = sc.next();
    		System.out.println("account type:");
    		String accounttype = sc.next();
    		System.out.println("balance:");
    		double balance = sc.nextDouble();
    		service.createAccount(mobileno,name,balance,accounttype);
    		System.out.println("Account created");
  
    	}
    	else if(Option==4) {
    	}
    	}
    	
    }
	
    	
    	
