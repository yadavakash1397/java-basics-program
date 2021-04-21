package jan19sub;

import jan19.AccessSpecifier;

public class Protected extends AccessSpecifier
{

	public static void main(String[] args) 
	{
//protected method accessed from different package by inheritance means extending class and creating object of subclass
		Protected asd=new Protected();
		asd.m2();

	}

}
