package JavaTest;

public class SingleInhertiance {
	public void test()
	{
		System.out.println("Class1");
		
	}
     public void test1()
     {
    	System.out.println("Class2");
    	
     }
     public class inhertiance2 extends SingleInhertiance {
    	 public  void add()
    	 {
    		System.out.println("Base Class");
    		
    	 }
    	 public void add1()
    	 {
    		 System.out.println("Base Class2");
    	 }
     }
    	 public static void main(String[] args)
    	 {
    		 SingleInhertiance d = new SingleInhertiance();
    		 
    		 //d.add();
    		// d.add1();
    		 d.test();
    		 d.test1();
    		 
    		 
    	 }
     }



