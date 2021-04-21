package jan9;

public class ElseIf 
{

	public static void main(String[] args) 
	{
		int marks=35;
		if(marks>=66)
		{
			System.out.println("distinction");
		}
		else if(marks>60)
		{
			System.out.println("first class");
		}
		else if(marks>55)
		{
			System.out.println("higher second class");
		}
		else if(marks>50)
		{
			System.out.println("second class");
		}
		else if(marks>=40)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
