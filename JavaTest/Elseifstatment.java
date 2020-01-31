package JavaTest;

public class Elseifstatment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a = 40;
     int b = 40;
     int c = 40;
     int d = 50;
    	 
     if(a>b && a>c && a>d)
     {
    	 System.out.println("a is greater");
     }
     else if (b>a && b>c && b>d)
     {
    	 System.out.println("b is greater");
    	 
     }
     else if (c>a && c>b && c>d)
     {
    	 System.out.println("c is greater");
     }
     else if(d>a && d>b && d>c)
     {
    	 System.out.println("d is greater");
     }
     else
     {
    	 System.out.println("both are same");
     }
	}

}

