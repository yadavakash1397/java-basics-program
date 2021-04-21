package jan7;

public class Constructror 
{
	int a, b;
	String s;
	void m1()
	{
		System.out.println("value of a="+a+ "b="+b +"s=" +s);
	}
	Constructror()
	{ 
	a=20;
	b=30;
	}
	Constructror (int a,int b,String s)
	{
	   this.a=a;
	   this.b=b;
	   this.s=s;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Constructror  cs=new Constructror (10,10,"akash");
		cs.m1();
	}

}
