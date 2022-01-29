package com.model;

public class Account {
	int accId;
	String accName;
	double balance;
	AccountType AType;
	
	public Account() {
		
	}
	
	public Account(int accId, String accName, double balance,AccountType AType) {
		super();
		this.accId = accId;
		this.accName = accName;
		this.balance = balance;
		this.AType = AType;
	}

	public void withDraw(int amount) {
		
			AType.withdraw(amount,this);
//			this.setBalance(this.balance-amount);
		
		
	}
	
	public void setAType(AccountType AType) {
		this.AType = AType;
	}
	public int getAccId() {
		return accId;
	}


	public void setAccId(int accId) {
		this.accId = accId;
	}


	public String getAccName() {
		return accName;
	}


	public void setAccName(String accName) {
		this.accName = accName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accId;
		result = prime * result + ((accName == null) ? 0 : accName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accId != other.accId)
			return false;
		if (accName == null) {
			if (other.accName != null)
				return false;
		} else if (!accName.equals(other.accName))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accName=" + accName + ", balance=" + balance + "]";
	}
	
	
}
