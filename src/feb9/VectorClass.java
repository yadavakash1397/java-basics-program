package feb9;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass 
{

	public static void main(String[] args) 
	{
		Vector vc=new Vector();
		vc.add(100);
		vc.add(200);
		vc.add("akash");
		vc.add(null);
		vc.add(null);
		vc.add(100);
		vc.add(200);
		vc.add(null);
		vc.add(null);
		vc.add(null);
		vc.add(null);

		System.out.println(vc);
		System.out.println();
		System.out.println(vc.capacity());
		System.out.println(vc.size());
		System.out.println("isempty"+vc.isEmpty());
		System.out.println("contains "+vc.contains(100));
		vc.set(0, 2000);
		System.out.println(vc);
		
		System.out.println(vc.get(3));
		vc.remove(0);
		System.out.println(vc);
		
		vc.add(2,500);
		System.out.println(vc);
		
		//iterator
		Iterator it=vc.iterator();		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		
		//listiterator
		ListIterator lst=vc.listIterator();
		while(lst.hasNext())
		{
			System.out.println(lst.next());
		}
		System.out.println();
		
		//enumeration
		Enumeration en=vc.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		System.out.println();
		
		//for each loop
		for(Object c:vc)
		{
			System.out.println(c);
		}
		
		}

}
