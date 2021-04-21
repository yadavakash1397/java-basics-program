package jan22;

public class MethodOverriding2 extends MethodOverriding1
{
	void m1()
	{
		System.out.println("non-static method from child class");
	}
	static void m2()
	{
		System.out.println("static method from child class");
	}
	
}
