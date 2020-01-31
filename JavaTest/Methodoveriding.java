package JavaTest;

public class Methodoveriding {
	
		   public static void main(String[] args)
		   {
			   Methodoveriding obj=new Methodoveriding();
		     obj.Method1();
		     System.out.println(obj.Method2());
		     obj.Method3(5,5);
		    // System.out.println(obj.Method4(4,5));
		     System.out.println(obj.combine("Nazar","aktrea"));
		   }
		   public void Method1(){
		       System.out.println("method without return type");
		   }
		   public String Method2(){
		       return "method with return type";
		   }
		   public void Method3(int a,int b){
		       System.out.println(a+b);
		   }
		   public int Method4(int a,int b){
		       return a+b;
		   }
		   public void PrintName(String name){
		       System.out.println(name);
		   }
		   public String combine(String name,String name1){
		       return name+name1;
		   }
		 }

