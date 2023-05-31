package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {
	private String stockNames;
    private int numOfShare;
    private double sharePrice;
    private double totalSharePrice;

    public String getStockNames() {
        return stockNames;
    }

	public int getNumOfShare() {
		return numOfShare;
	}

	public void setNumOfShare(int numOfShare) {
		this.numOfShare = numOfShare;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public double getTotalSharePrice() {
		return totalSharePrice;
	}

	public void setTotalSharePrice(double totalSharePrice) {
		this.totalSharePrice = totalSharePrice;
	}

	public void setStockNames(String stockNames) {
		this.stockNames = stockNames;
	}

	static Scanner scanner = new Scanner(System.in);
    ArrayList<StockAccount> arrayList = new ArrayList<>();
    static double balance = 10000000;

    public void addStock() {
    	StockAccount stock;
        stock = new StockAccount();
        double withdraw = 0;

        System.out.println(" Enter the stock name");
        scanner.nextLine();
        stock.setStockNames(scanner.nextLine());

        System.out.println("Enter the Number of shares");
        stock.setNumOfShare(scanner.nextInt());

        System.out.println("Enter the each share price");
        stock.setSharePrice(scanner.nextDouble());
            withdraw = stock.getSharePrice() * stock.getNumOfShare();
            if(balance>=withdraw) {
                balance = balance - withdraw;
                arrayList.add(stock);
                System.out.println("Remaining balance = "+balance);
            }else
                debit(withdraw);
    }

    public void printStockReport() {
    	StockAccount stock;
        stock = new StockAccount();
        for (int i = 0; i < arrayList.size(); i++) {
            stock = arrayList.get(i);
            System.out.println(stock.toString());

        }
    }

    public void debit(double withdraw) {
        if (withdraw > balance) {
            System.out.println("Debit amount exceeded account balance.");
            System.out.println("Remaining balance = "+balance);
            System.out.println("withdraw = "+withdraw);
        }

    
    }
	
    public static void main(String[] args) {
    	StockAccount stockManagement = new StockAccount();
        while (true) {
        	Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the selection\n1)addStock\n2)displayStockReport\n3)exit");
            byte choice = scanner.nextByte();
            switch (choice) {
                case 1 -> stockManagement.addStock();
                case 2 -> stockManagement.printStockReport();
                case 3 -> System.exit(1);
            }
        }
    
    }

    }

