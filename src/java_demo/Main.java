package java_demo;

import java.util.Scanner;
public class Main {

	public void Get_count(String input){
	char c[]= input.toCharArray();
		int size =c.length;
		
			
		for (int l=0;l<=size-1;l++) {
			
			int count = 0;
			
			for(int k=0;k<=size-1;k++) {
				if(c[l]==c[k]) {
					count++;
				}}
				System.out.println(c[l]+" = " +count); }}
			 
		
		 
	
public static void main(String[] args) {
	Main ak = new Main();
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter the string");
	String input = sc.nextLine();
	ak.Get_count(input);
}
}
