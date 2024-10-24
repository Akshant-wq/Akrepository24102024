package java_demo;

import java.util.Scanner;



public class Marksheet_demo {
	String Name, Father_name, College_name;
	long Roll_no;
	int Marks_Hindi, Marks_Eng, Marks_Science, Marks_Com, Marks_Math;
	float Total, Percentage;
	
	public void marks() {
	Scanner ab	= new Scanner(System.in);
	
	System.out.println("Pls enter the Name");
	 Name = ab.nextLine();
	 
		System.out.println("Pls enter the Father_name");
		Father_name = ab.nextLine();
		
		System.out.println("Pls enter the College_name");
		 College_name = ab.nextLine();
		 
			System.out.println("Pls enter the Roll_no");
			 Roll_no = ab.nextLong();
			 
				System.out.println("Pls enter the Marks_hindi");
				 Marks_Hindi = ab.nextInt();
				 
				 System.out.println("Pls enter the Marks_Eng");
				 Marks_Eng = ab.nextInt();
				 
				 System.out.println("Pls enter the Marks_Science");
				 Marks_Science = ab.nextInt();
				 
				 System.out.println("Pls enter the Marks_Com");
				 Marks_Com = ab.nextInt();
				 
				 System.out.println("Pls enter the Marks_Math");
				 Marks_Math = ab.nextInt();
				 
				 Total = Marks_Hindi+Marks_Eng+Marks_Science+Marks_Com+Marks_Math;
				 
				 Percentage = (Total*100)/500;
		   
				 
				 
				 System.out.println("--------------------Marksheet------------------");
				 
				 System.out.println("Name"+Name);
				 System.out.println("Father Name - "+Father_name);
				 System.out.println("College Name - "+College_name);
				 System.out.println("Roll no - "+Roll_no);
				 
				 System.out.println("--------------------Subject Marks------------------");
				 
				 System.out.println("Hindi Marks - "+Marks_Hindi);
				 System.out.println("English Marks - "+Marks_Eng);
				 System.out.println("Scienece Marks - "+Marks_Science);
				 System.out.println("Computer Marks - "+Marks_Com);
				 System.out.println("Math Marks - "+Marks_Math);
				 System.out.println("--------------------------------------------------");
				 System.out.println("Total Marks - "+Total);
				 System.out.println("Percentage % - "+Percentage+"%");
					
	}
	
	public static void main(String[] args) {
		Marksheet_demo ak = new Marksheet_demo();
		ak.marks();
	}

}
