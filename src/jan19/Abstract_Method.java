package jan19;

public abstract class Abstract_Method //abstract class/incomplete class
{
	abstract void m1();				  //abstract method/incomplete method
	void m2()						  //complete method
	{
		System.out.println("complete method");
	}
}

class child extends Abstract_Method	  //concrete class
{
	void m1()						  //method completed
	{
		System.out.println("abstract method");
	}
	public static void main(String[] args)
	{
		
		child ch=new child();
		ch.m1();
		ch.m2();
		//Abstract_Method am=new Abstract_Method(); //we cannot create object of abstract class
	}
}
/*
Abstract class: class declared with abstract keyword is abstract class
it is incomplete class where programmer can declare complete and incomplete methods
programmer can declare abstract methods by using abstract keyword
we cannot create object of abstract class,for access we use concrete class

concrete class: class which provides definations(body) for all incomplete methods which are present abstract class 
with help of extends keyword is called concrete class.
*/
