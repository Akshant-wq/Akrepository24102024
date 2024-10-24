package java_demo;

import java.util.Scanner;

public class Get_for {
	int a;
	public void Get_table(int num){
		
		
		for(int i=1;i<=10;i++) {
			a=num*i;
			System.out.println(num+"x" + i + "=" +a);
		}
		}
public static void main(String[] args) {
	
	Get_for ob = new Get_for();
	Scanner sc =new Scanner (System.in);
	System.out.println("pls enter the num");
	int num = sc.nextInt();
	ob.Get_table(num);
	
}
}
