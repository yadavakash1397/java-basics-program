package jan22;

public class MethodOverloading2 extends MethodOveloading
{
	void m1(int a, int b)
	{
		System.out.println("method m2 from child class");
		//super.a=a;
		System.out.println("a="+super.a+" "+"b="+b);
	}


	public static void main(String[] args) 
	{
		MethodOverloading2 mo2=new MethodOverloading2();
		mo2.m1(50,60);
		
	}

}
