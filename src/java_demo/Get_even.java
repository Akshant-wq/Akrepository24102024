package java_demo;

import java.util.Scanner;

public class Get_even {
	
	public void Start(int a,int b) {
		
		for(int i=a;i<=b; i++) {
			
			if (i%2==0) {
				
				System.out.print(i+",");
			}
			else if (i%2!=0) {
			System.out.println(i);
			
			} 
			
			else {
				System.out.print("Wrong number");
				
			}
		}
		
	}
	
public static void main(String[] args) {
	Get_even dp = new Get_even();
	Scanner sc = new Scanner (System.in);
	 System.out.println("pls enter the two number");
	 
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 
	 dp.Start(a,b);
	
	
}
}
