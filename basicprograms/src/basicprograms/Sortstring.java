package basicprograms;

public class Sortstring {

	public static void main(String[] args) {
		int a [] = {1,3,5,2};
		for (int i = 0; i < a.length; i++)
		{
			
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}
			}	
		}
		for (int k = a.length-1; k>=0; k--) {
			System.out.println(a[k]);
			
		}
		

	}

}
