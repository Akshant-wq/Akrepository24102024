package java_demo;

import java.util.Scanner;

public class Just_demo {
	String out="";
	String put="";
	public void get_string(String input1,String input2)
	{

          String s[]=input1.split(" ");
         
		for(int i=0;i<=s.length-1;i++) {
		
			if(input2.equalsIgnoreCase(s[i])) {
				 
				 for (int m=0;m<=s.length-1;m++) {
					 
				 char c[] = s[m].toCharArray();
				
				 for(int j=c.length-1;j>=0;j--) {
					out=out+c[j];
					
				}out=out+" ";}
				
			
			if (input2!=s[i]) {
				
				char[] h = input2.toCharArray();
				
				for(int k=h.length-1;k>=0;k--) {
					out=out+h[k];
					
				}put=put+" ";
				
			
			}}}System.out.println(out);
			System.out.println(put);}
			
		
		
	
	public static void main(String[] args) 
	{
		Just_demo ob = new Just_demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the two STring ");
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		ob.get_string(input1,input2);
	}
}

