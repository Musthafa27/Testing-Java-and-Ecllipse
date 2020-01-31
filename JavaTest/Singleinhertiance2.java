package JavaTest;

 class Singleinhertiance2 {
	
	
	   public void methodA()
	   {
	     System.out.println("Base class method");
	   }
 }
	 class center extends Singleinhertiance2
	{
	   public void methodB()
	   {
	     System.out.println("Child class method");
	   }
	   public static class test1
	   {
	   public static void main(String args[])
	   {
		   center obj = new center();
	     obj.methodA(); //calling super class method
	     obj.methodB(); //calling local method
	  }
	   }
	}
	



