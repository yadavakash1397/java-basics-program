package jan23;

public class UpCasting 
{

	public static void main(String[] args) 
	{//parent class properties access by parent 
		Parent pr=new Parent();
		pr.m1();
	//parent class properties access by child
		Child ch=new Child();
		ch.m1();
	//properties of child class accessed by parent only which given by parent
		Parent pc=new Child();
		pc.m1();
		pc.m2();
		pc.m3();
		
	}

}
