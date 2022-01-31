package com.model;

public class SavingsAcc implements AccountType{

	public void withdraw(double amount, Account acc) {
		// TODO Auto-generated method stub
		
//		Account acc = (Account) obj;
		try {
			if(amount < 0) {
				throw new NotAvailableAmountException();
			}
			if(acc.balance - amount < 0) {
				throw new LessBalanceException();
			}
			acc.setBalance(acc.balance - amount);
			
		}
		catch(NotAvailableAmountException e) {
			System.out.println("Not valid amount");
		} 
		catch (LessBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println("Balance not sufficient");
		}
		
		System.out.println("\nSavings withdrawal\n");
		
		
	}


}
