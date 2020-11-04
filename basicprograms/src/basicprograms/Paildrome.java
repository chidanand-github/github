package basicprograms;

public class Paildrome {

	public static void main(String[] args) 
	{
		String st = "abe";
		String rev = "";
		for (int i = st.length()-1; i >=0; i--) {
			
			rev=rev+st.charAt(i);
		}
			
			if(rev.equalsIgnoreCase(st))
			{
				System.out.println("paildrome");
			}
			else
			{
				System.out.println("not paildrome");
			}
			
		}
	

}
