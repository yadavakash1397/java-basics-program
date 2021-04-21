package jan22;

public class MethodOveloading 
{
	int a=70;
	void m1()
	{
		a=90;
		System.out.println("method m1");
		System.out.println(this.a);
	}
	
	void m1(int a)
	{
		this.a=a;
		System.out.println("method m1");
		System.out.println(this.a);
	}
	static void m1(int a,float b)
	{
		System.out.println("method m1");
		System.out.println("a="+a+" b="+b);
	}

	public static void main(String[] args) 
	{
		MethodOveloading mo=new MethodOveloading();
		mo.m1(10,20);
	}
}
/*
polymorphism
polymorphism is one of oops principle where one object showing different behaviour at different stages of life cycle

two types of polymorphism
1. compiletime polyphorphism
2. runtime polymorphism
  
1. compiletime polymorphism: 
							in this polymorphism, method declaration is get binded with method defination 
							at compiletime based on arguments, is called compile time polymorphism.
							
							binding takes place at compiletime so also called as early binding.
							
							once binding is done again rebinding can not possible, so also called static binding.
							
							method overloading is example of compile time polymorphism.
							
2. runtime polymorphism: 
							in this polymorphism, method declaration is get binded with method definition at runtime
							based upon object creation
							
							binding will takes place at runtime so it is called as late binding
							
							once binding is done again rebinding possible, so also called as dynamic binding.
							
							method overriding is example of runtime polymorphism.
							
 * method overloading: declare different methods with same nameand diferent parameteres in same calss is called as
                       method overloading
                       
 * method overriding: acquiring superclass methods into subclass by using extends keywords & changing defination
 					  subclass specification, is called as overriding.
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
*/