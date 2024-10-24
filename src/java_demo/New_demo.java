package java_demo;



class New_one{
	int a,b;
	public void scv(int a,int b) {
	int c=a-b;
	System.out.println(c);}
}
public class New_demo extends New_one {
	int a,b;
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		New_demo ab = new New_demo();
		ab.add(20,40);
		ab.scv(20,56);
		
	}

}
