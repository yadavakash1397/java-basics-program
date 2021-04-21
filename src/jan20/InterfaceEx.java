package jan20;

public class InterfaceEx implements I1,I2
{
	public void m1()
	{
		System.out.println("multiple inheritance m1");
	}
	public void m2()
	{
		System.out.println("multiple inheritance m2");
	}
	public static void main(String[] args) 
	{
		InterfaceEx ix=new InterfaceEx();
		ix.m1();
		ix.m2();
	}

}
