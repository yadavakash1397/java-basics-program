package jan6;

import jan5.PublicRefForjan6;

class CallMethod
{
	public static void remainder(int a,int b)
	{
		System.out.println("remainder is "+(a/b));
	}
	
}
public class MethodCall 
{
	void calculation(int a,int b)
	{
		System.out.println("Addition is "+(a+b));
		System.out.println("subtraction is "+(a-b));
		System.out.println("multiplication is "+(a*b));
		System.out.println("division is "+(a/b));
	}

	public static void main(String[] args) 
	{
		MethodCall mc=new MethodCall();
		mc.calculation(10, 5);          //method call from same class
		CallMethod cm=new CallMethod();
		cm.remainder(20, 3);            //method call from diff class
		
		PublicRefForjan6.m2(10,20);     //method call from diff package and class
		
	}

}
