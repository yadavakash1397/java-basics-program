package jan19sub;

import jan19.AccessSpecifier;

public class PublicKeyword 
{
//method from different package accessed here
	public static void main(String[] args) 
	{
		AccessSpecifier as=new AccessSpecifier();
		as.m1();
	}

}
