package basicprograms;

public class EvenNUmber {

	public static void main(String[] args) 
	{
		int  [] a = {1,2,3,4,5,6,7,8,9};
		int []e=new int[a.length];
		int []o=new int[a.length];
		System.out.println("odd"+ "/t" +"even");
		for (int i = 1; i <=a.length-1; i++) 
		{
			if((a[i]%2)==0)
			{
				e[i]=i;
				System.out.println("even----------"+e[i]);
				
			}
			else
			{
			o[i]=i;
			System.out.print("odd----------"+o[i]);
			}
			
		}
		

	}

}
