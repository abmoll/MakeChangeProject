import java.util.Scanner;

public class GiveChange {

	public static void main(String[] args) {

		int twenties, tens, fives, ones, quarters, dimes, nickels, pennies;
		
		Scanner keyb = new Scanner(System.in);
		System.out.println("Enter the price of the item: ");
		float price = keyb.nextFloat();
		
		System.out.println("Enter amount tendered: ");
		float tendered = keyb.nextFloat();
		float change = tendered - price;

		change = change * 100;
		int cents = (int)change;

		if (cents == 0) 
			System.out.println("You made my life easy by giving exact change!");
		else if (cents < 0) 
			System.out.println("You gave too little cash - try again.");
		else {
	
			twenties = cents / 2000;
			cents = cents % 2000;
			tens = cents / 1000;
			cents = cents % 1000;
			fives = cents / 500;
			cents = cents % 500;
			ones = cents / 100;
			cents = cents % 100;
			quarters = cents / 25;
			cents = cents % 25;	
			dimes = cents / 10;	
			cents = cents % 10;
			nickels = cents / 5;
			cents = cents % 5;
			pennies = cents;
		
			System.out.println("Your change is:");
			
			if (twenties != 0) 
				System.out.println(twenties + " twenty dollar bill");
			if (tens != 0)
				System.out.println(tens + " ten dollar bill");
			if (fives != 0)
				System.out.println(fives + " five dollar bill");
			if (ones != 0)
				 System.out.println(ones + " one dollar bill");
			if (quarters != 0)
				 System.out.println(quarters + " quarter");
			if (dimes != 0)
				 System.out.println(dimes + " dime");
			if (nickels != 0)
				 System.out.println(nickels + " nickel");
			if (pennies != 0 && pennies > 1)
				 System.out.println(pennies + " pennies");
			else if (pennies == 1)
				System.out.println(pennies + " penny");
					
		}
					
	}

}
