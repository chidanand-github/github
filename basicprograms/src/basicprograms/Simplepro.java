package basicprograms;

import java.util.Arrays;


public class Simplepro extends Thread
{
   private static Simplepro ter = null;
	private Simplepro() {
		System.out.println("objecte is created"+getClass().getName().toString());
		 
	 }
	public static  Simplepro getSimplepro() {
		if(ter==null) {
			
			ter= new Simplepro();	
		}
		
		return ter;	
	}
	public static void main(String[] args) 
	{
		System.out.println("hhhjiuhuih"+Simplepro.getSimplepro());
	}
}