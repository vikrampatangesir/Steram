package work;

public class A {

	
	private static A obj;
	public A() {
		// TODO Auto-generated constructor stub
	}

	
	
	public static A get()
	{
		
		if(obj==null)
			synchronized(Singlton.class)
			{
				
			  if(obj==null)
			  {
				  obj=new Singlton();
			  }
				
				
			}
		return obj;
		
		
		
		
	}
}
