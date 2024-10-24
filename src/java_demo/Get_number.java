package java_demo;

import java.util.Scanner;

public class Get_number {
	
	public void Count(int number) {
		
		if (number>100) {
			
			System.out.println("Your number is grater then 100");
		}

		else {	
			for(int i=100;i>=1;i--) {
				
				System.out.println(i);
				
			}
		}
		
		
	}
	public static void main(String[] args) {
		Get_number ak = new Get_number();
		Scanner sc = new Scanner (System.in);
		System.out.println("pls enter the number");
		int number = sc.nextInt();
		ak.Count(number);
		
		
		

	
	}

}
