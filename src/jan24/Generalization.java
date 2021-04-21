package jan24;

public class Generalization 
{

	public static void main(String[] args) 
	{
		ChildClass1 cc1=new ChildClass1 ();
		cc1.m1();
		cc1.m2();
		cc1.m3();
		
		ChildClass2 cc2=new ChildClass2();
		cc2.m1();
		cc2.m2();
		cc2.m4();

	}

}
/*
 Generalization:
	Generalization is the process of extracting shared characteristics from two or more classes, 
	and combining them into a generalized superclass.

	generalization file can be normal java class or abstract class or Interface, but only Interface is recommended.


Abstraction:
	 abstraction is one of the oops principle in java.

	 Hiding the implementation code and providing only functionality to the end user is called abstraction. 

	The scenario of Abstraction is "if customer is visiting or making use of any application, 
	then he should utilize functionality only & he should not feel any backend code processing"
 */
