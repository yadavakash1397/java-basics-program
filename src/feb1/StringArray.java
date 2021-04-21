package feb1;

import java.util.Arrays;

public class StringArray 
{

	public static void main(String[] args) 
	{
		String[] s= {"velocity","training","institute","pune"};
		
		Arrays.sort(s);
		//now in alphabetically format
		for(String a:s)
		{
			System.out.print(a+" ");
		}
	}

}
