package feb4;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrlst 
{

	public static void main(String[] args) 	
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(null);
		al.add(null);
		al.add(70);
		System.out.println(al);
		
		al.add(2, 100);
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		System.out.println(al.get(2));
		al.set(1, 120);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains(20));
		
		ArrayList ls=new ArrayList();
		Scanner reader =new Scanner (System.in);
		for(int i=0;i<=4;i++)
		{
			ls.add(i, reader.nextInt());
			
		}
		System.out.println(ls);
		
			
	}

}
