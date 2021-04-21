package jan19;

public class AccessSpecifier 
{
//public means access in anywhere in project
	public void m1()
	{
		System.out.println("public method");
	}
	
//protected means access in anywhere in project but through in inheritance
	protected void m2()
	{
		System.out.println("protected method");
	}
	
//default means access in anywhere in package
	void m3()
	{
		System.out.println("default method");
	}
	
//private means access in anywhere in class not in package
	private void m4()
	{
		System.out.println("private method");
	}
	public static void main(String[] args) 
	{
		AccessSpecifier acs=new AccessSpecifier();
		acs.m4();
	}

}


