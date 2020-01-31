package methodoverloading;

public class Childclass extends Overloadbaseclass {

	public void test123(int a)
	{
		System.out.println(a);
	}
	public void test123(String Mus)
	{
		System.out.println(Mus);
	}
	public static void main(String[] args) {
		Childclass mus = new Childclass();
		mus.test123("test", 10);
		mus.test123(10, "test1");
		mus.test123("test123");
		mus.test123(10);
	}
}
