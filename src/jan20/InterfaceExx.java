package jan20;

public interface InterfaceExx 
{
	int a=20;      //bydefault final and static
	int b=30;

	void m1();     //only abstract/incomplete methods are there
	void m2();
	/*
	void m3()      //complete method are not allowed
	{
		
	}
	*/
}

class a implements InterfaceExx
{
	//int a=140;
	public void m1()
	{
		System.out.println("method m1 implemented");
		//int a=130;
		//a=40;
	}
	public void m2()
	{
		System.out.println("method m2 implemented");
	}
	public static void main(String[] args) 
	{
		a ab=new a();
		ab.m1();
		ab.m2();
		System.out.println(a);
	}
}
/*
interface is mechanism to achieve abstraction.
it is one of the oops principle.
it is used to declare only incomplete(abstract) method in it.
there can only abstract method in java interface.


features--------
data members(only variables) declared inside interface are bydefault static and final.
method declared inside interface are bydefault public and abstract.
constructor concept is not present in interface.
object of interface can't be created.
interface support multiple inheritance.
if to create object of interface then programmer need to make use of implementation class using implements keyword.
*/