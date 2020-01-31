package bacicJavaProgram;

import org.apache.poi.util.SystemOutLogger;

public class ReturnType {
	
	 int amout = 100;
	
	public int returamt()
	{
		System.out.println("Thre return amt is "+ amout);
		return amout;
	}
	public static void main(String[] args) {
		ReturnType type = new ReturnType();
	int amt = 	type.returamt();
	System.out.println(amt);
		
	}

}
