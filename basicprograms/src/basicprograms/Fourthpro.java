package basicprograms;

public class Fourthpro {
	Object Message() {
		return "hello";
		
	}

	public static void main(String[] args) 
	{
		System.out.println(new Fourthpro().Message());
		System.out.println(new Forthpro12().Message());
	}

}
class Forthpro12 extends Fourthpro
{
	String  Message()
	{
		return "world";
		
	}
}
