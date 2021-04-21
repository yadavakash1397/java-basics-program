package jan16;

class parent
{
	 int a=10;
	 int b=40;
	 void dp()
	 {
		 System.out.println(a+" "+b);
	 }
}

class child extends parent
{
	int a=50;
	int b=90; 
		
	 void pp()
	 {
		 int a=70;
		 int b=80;
		 System.out.println(a+" "+b);                   //same method
		 System.out.println(this.a+" "+this.b);         //same class
		 System.out.println(super.a+" "+super.b);		//same parent class

	 }
}






public class SuperEx 
{
	

	public static void main(String[] args) 
	{
		child ch=new child();
		ch.pp();
		//ch.dp();
	}

}

