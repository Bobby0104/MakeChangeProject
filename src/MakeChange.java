import java.util.Scanner;
public class MakeChange {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		double itemPrice = 0;
		double amountTendered = 0;	
		int twenties, tens, fives, dollars, quarters, dimes, nickles, pennies = 0;
		
	
		
		System.out.println("What is the price of this item?");
			itemPrice =  kb.nextDouble();
		System.out.println("What was the dollar amount tendered by the customer?");
			amountTendered =  kb.nextDouble();
			
			double remainingAmount = amountTendered - itemPrice;
			
			
			
			if(amountTendered == itemPrice) {
				System.out.println("Thank you enjoy your day!");
			}
			else if(amountTendered > itemPrice) {
				System.out.println("Thank you heres your change.");
			}
			if(amountTendered < itemPrice) {
				System.out.println("Sorry this is not enough");
			}
			
			double amount = remainingAmount;
			int returnedAmount = (int)(amount * 100);					
			
			twenties = returnedAmount /2000;			
			returnedAmount = returnedAmount % 2000;
			
			tens = returnedAmount /1000;
			returnedAmount = returnedAmount % 1000;
			
			fives = returnedAmount /500;
			returnedAmount = returnedAmount % 500;
			
		    dollars = returnedAmount /100;
			returnedAmount = returnedAmount % 100;
			
			quarters = returnedAmount /25;
			returnedAmount = returnedAmount % 25;
			
			dimes = returnedAmount /10;
			returnedAmount = returnedAmount % 10;
			
			
			nickles = returnedAmount /5;
			returnedAmount = returnedAmount % 5;
			
			pennies = returnedAmount /1;
			returnedAmount = returnedAmount % 1;
			 
			
			if(twenties != 0) {
				System.out.println("twenties " + twenties);
			}
			if(tens != 0) {
				System.out.println("tens " + tens);
			}
			if(fives != 0) {
				System.out.println("fives " + fives);
			}
			if(dollars != 0) {
				System.out.println("dollars " + dollars);
			}
			if(quarters != 0) {
				System.out.println("quarters " + quarters);
			}
			if(dimes != 0) {
				System.out.println("dimes " + dimes);
			}
			if(nickles != 0) {
				System.out.println("nickles " + nickles);
			}
			if(pennies != 0) {
				System.out.println("pennies " + pennies);
			}			
	
			kb.close();
		
	}
}
