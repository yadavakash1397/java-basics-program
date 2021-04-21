package jan5;

 class diff
{
	public static void m2()
	{
		System.out.println("this is static m2 method from diff class");
	}
	
	void m4()
	{
		System.out.println("this is non static method from diff class");
	}
			
}


public class Method 
{
	//1)static method from same class
	//2)static method form diff class
	//3)non-staic method from same class
	//4)non static method from diff class
	static void m1()
	{
		System.out.println("this is static m1 method");
	}
	
	void m3()
	{
		System.out.println("this is non static m3 method");
	}

	public static void main(String[] args) 
	{/*
		m1();//1) static method call from same class
		
		
		
		
		diff.m2();//2)static method call form diff class
		
		
		*/
		
		Method md=new Method();
		md.m3();//3)non-staic method call from same class. object creation req bcoz non static calling in static
		diff df=new diff();
		df.m4();//4)non static method call from diff class. object creation req bcoz non static calling from static
		
	}

}
