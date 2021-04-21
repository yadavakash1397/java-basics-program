package jan12;

class parent
{
	void display()
	{
		System.out.println("display method parent class");
	}
	 void print()
	 {
		 System.out.println("print method parent class");
	 }
}

public class Inheritance extends parent
{

	public static void main(String[] args) 
	{
		
		
		int i=10;//10
		
		System.out.println(++i);//11
		
		System.out.println(i++);//11
		
		System.out.println(i);
		
		
		
		parent pr=new parent();
		pr.display();
		pr.print();
		
	}

}
