package feb9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass
{

	public static void main(String[] args)
	{
		LinkedList ll= new LinkedList();
		
		ll.add(10);
		ll.add("akash");
		ll.add(null);
		ll.add(null);
		ll.add('c');	
		System.out.println(ll);
		
		System.out.println(ll.contains(10));
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		ll.set(0,200);
		System.out.println(ll);
		System.out.println(ll.get(2));
		System.out.println(ll.remove(1));
		System.out.println(ll);
		System.out.println();
		
		//Iterator
		System.out.println("---------------access using iterator--------------------");
		Iterator it =ll.iterator();	
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//ListIterator
		System.out.println("---------------access using Listiterator--------------------");
		ListIterator lt=ll.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		
		//for each loop
		System.out.println("---------------access using for each loop--------------------");
		for(Object o:ll)
		{
			System.out.println(o);
		}
		
		//for loop
		System.out.println("---------------access using for loop--------------------");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
