package feb8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistC
{

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add(101);
		list.add("akash");
		list.add(190);
		
		System.out.println(list);
		System.out.println();
		//1 reading value from arraylist
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		//2 by using for each loop
		
		for(Object o:list)
		{
			System.out.println(o);
		}
		System.out.println();
		
		//3 by using iterator
		ListIterator it=list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}	
		
	}

	
}
