package java_demo;

import java.util.Scanner;

public class Get_string {
	
	public void Get_name(String name) {
		
		for (int i=1;i<=10;i++)
		{
		
		System.out.println(name+" "+i);
		}
		}
public static void main(String[] args) {
	Get_string ak = new Get_string();
	Scanner sc = new Scanner(System.in);
	System.out.println("pls enter the name");
	String name =sc.next();
	ak.Get_name(name);
	
}
}
