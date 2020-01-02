package entity;
public class Account {
	private String mobileno;
	private String name;
	private double balance;
	private String accType;
	
	
	public Account() {
		this("","",0,"");
	}
	
	public Account(String mobileno, String name, double balance, String accType) {
		this.mobileno = mobileno;
		this.name = name;
		this.balance = balance;
		this.accType=accType;
	}
	

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	@Override
    public String toString() {
        String display=mobileno+" "+name +" "+balance;
        return display;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==(this)){
            return true;
        }
        if(obj ==null|| !(obj instanceof Account)){
            return false;
        }
        Account e=(Account)obj;
        return e.mobileno.equals(this.mobileno);
    }

    @Override
    public int hashCode() {
        return mobileno.hashCode();
    }
}
