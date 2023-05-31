package com.bridgelabz;

import java.util.Scanner;

public class AccountBalance {
	 private int balance;

	    public AccountBalance(int initialBalance) {

	        if (initialBalance > 0)
	            balance = initialBalance;
	    }

	    public void credit(int amount) {
	        balance = balance + amount;
	    }

	    public void debit(int debitAmount) {

	        if (debitAmount > balance) {
	            System.out.println("Debit amount exceeded amount balance: ");
	        }
	        balance = balance - debitAmount;
	    }

	    public int getBalance() {
	        return balance;
	    }
	


	    public static void main(String[] args) {

	        AccountBalance account = new AccountBalance(1000);
	        System.out.println("Account Balance: " + account.getBalance());

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter amount for Debit: ");
	        int debitAmount = sc.nextInt();
	        account.debit(debitAmount);

	        System.out.println("Account balance: " + account.getBalance());
	        System.out.println("Enter amount for Credit: ");
	        int creditAmount = sc.nextInt();
	        account.credit(creditAmount);
	        System.out.println("Account Balance: " + account.getBalance());
	    }
	}

