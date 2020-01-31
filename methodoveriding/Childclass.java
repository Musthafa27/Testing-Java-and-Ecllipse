package methodoveriding;

public class Childclass extends Parentclass {
	
	public void ride(){
		System.out.println("test2");
	}

	public static void main(String[] args) {
		Parentclass mus = new Childclass();
		mus.ride();
		
		
		
	}
}
