package basicprograms;

public class Numberpaildrome {

	public static void main(String[] args) {
		int v=121;
		int r,sum=0;
		r=v;
		while(v>0)
		{
			int temp=v%10;
			sum=(sum*10)+temp;
			v=v/10;
		}
		if(v==sum) {
			System.out.println("paildrome");
			
		}
		else
		{
			System.out.println("not paildrome");
		}
	}

}
