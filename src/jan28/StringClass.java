package jan28;

public class StringClass 
{

	public static void main(String[] args) 
	{
		String st="akash";
		String lst="AKASH";
		String e="";
		System.out.println(st.toUpperCase());
		System.out.println(lst.toLowerCase());
		System.out.println(st.charAt(2));
		System.out.println(st.indexOf("a"));
		System.out.println(st.lastIndexOf("a"));//17
		System.out.println(st.concat(lst));
		System.out.println(st.contains("ks"));
		System.out.println(st.equals(lst));
		System.out.println(st.equalsIgnoreCase(lst));
		System.out.println(st.length());//9
		System.out.println(st.substring(0,3));//10
		System.out.println(st.substring(3));//11
		System.out.println(e.isEmpty());//12
		System.out.println(st.replace('a', 'v'));//13
		System.out.println(st.replace("aka", "roh"));//14
		System.out.println(st.endsWith("sh"));//15
		System.out.println(st.startsWith("ak"));//16
		
		
		
	}

}
