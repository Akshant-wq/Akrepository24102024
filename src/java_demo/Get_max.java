package java_demo;

import java.util.Scanner;

public class Get_max {
	public void get_min() {
		System.out.println("Please enter the 5 Number ");
		int ab[]=new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<=4;i++) {
			ab[i]=sc.nextInt();
			}
		int max=0;
		for(int j=0;j<=4;j++) {
			if(max<ab[j]) {
				max=ab[j];
			
			}
			}System.out.println("maximu valu = " +max);
		
		
	}
	public static void main(String[] args) {
		Get_max ob= new Get_max();
		ob.get_min();
		
	}

}
