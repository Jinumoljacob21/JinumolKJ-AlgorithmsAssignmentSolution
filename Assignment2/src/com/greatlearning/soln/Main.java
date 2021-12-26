package com.greatlearning.soln;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		CompaniesStock cs=new CompaniesStock();
		StockValue  sv= new StockValue();
		
		
		System.out.println("Enter the number of companies");
		int numCompanies=sc.nextInt();
		int company[]=new int[numCompanies];
		int numTrue=0;
		int numFalse=0;
		
		for(int i=0;i<numCompanies;i++) {
			
			System.out.println("Enter current stock price of the company "+(i+1));
			company[i]=sc.nextInt();
			System.out.println("Whether company's stock price rose today compare to yesterday");
			boolean bn=sc.nextBoolean();
			if(bn==true) {
				numTrue=numTrue+1;
			}
			else {
				numFalse=numFalse+1;
			}
		}
		System.out.println("Enter the operations that you want to perform");
		
		System.out.println("1:Display the companies stock price in ascending order"); 
		System.out.println("2:Display the companies stock price in descending order");
		System.out.println("3:Display the  total no of companies for which stock price rose today");
		System.out.println("4:Display the  total no of companies for which stock price declined today");
		System.out.println("5:Search a specific stock price");
		System.out.println("6:press 0 to exit");
		
		int option=sc.nextInt();
		cs.stockPrices(0,company.length-1, company);
		
		switch(option) {
		case 1:	
			System.out.println("Stock prices in ascending order are :  ");
			for(int i=0;i<numCompanies;i++) {
				System.out.print(company[i]+" ");
			}
			break;
			
		case 2:
			System.out.println("Stock prices in descending order are :  ");
			for(int i=numCompanies-1;i>=0;i--) {
				System.out.print(company[i]+" ");
			}
			
			break;
			
		case 3:
			System.out.println("Total no of companies whose stock price rose today: "+numTrue);
			
			break;
			
		case 4:
			System.out.print(" Total no of companies whose stock price declined today:  "+numFalse);
			break;
		case 5:
			
			System.out.print("Enter the key value :  ");
			int key=sc.nextInt();
			sv.findStockvalue(company,0,numCompanies,key);
			
			break;
		case 0:
		
			System.out.println("Exit successfully");
			
			break;
		
			
			
		}
		sc.close();
	}

}
