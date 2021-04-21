package jan9;

public class NestedElseIf 
{

	public static void main(String[] args)
	{
		int th_marks=40;
		int pr_marks=20;
		if(th_marks>=35||pr_marks>=35)
		{
			if(th_marks>=35)
			{
				System.out.println("theory pass");
			}
			else
			{
				System.out.println("theory fail");
			}
			if(pr_marks>=35)
			{
				System.out.println("practile pass");
			}
			else
			{
				System.out.println("practicle fail");
			}
		}
		else
		{
			System.out.println("failed in practicle and theory");
		}

	}

}
