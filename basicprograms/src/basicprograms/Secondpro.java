package basicprograms;

public class Secondpro {

	public static void main(String[] args) 
	{
		String message = "hello world!";
		//substring always forword  start to end index not end to start backword
		 String newmessage =  message.substring(12,6)+message.subSequence(1, 5);
		 System.out.println("newmessage--------------" +newmessage);
		               
	}

}
