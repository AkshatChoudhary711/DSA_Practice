package org.practice.tcs;

import javax.management.ValueExp;
import java.util.Scanner;

public class problem_1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double[] price = {80.0, 130.0, 100.0, 80.0, 90.0, 110.0, 120.0, 140.0, 70.0, 80.0};
		System.out.println("INPUT VALUES");
		double bill = 0;
		int item, qty;
		char choice;
		do{
			try{
				item = sc.nextInt();
				qty = sc.nextInt();
				bill+= (price[item-1] * qty);
			}catch(IndexOutOfBoundsException e){
				System.out.println("Provided item no. is not present");
				System.exit(0);
			}catch (Exception e){
				System.out.println("Invalid input type!");
				System.exit(0);
			}
			System.out.print("Do you want to order more? (Y/N): ");
			choice = sc.next().toLowerCase().charAt(0);
			if(choice != 'y' && choice != 'n'){
				System.out.println("INVALID INPUT!");
				System.exit(0);
			}
		}while(choice=='y');

		System.out.println("Total Amount: "+bill);

	}

}
