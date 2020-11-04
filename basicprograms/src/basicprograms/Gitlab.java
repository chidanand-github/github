package basicprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Gitlab {

	public static void main(String[] args) throws IOException,InterruptedException
	{
		try 
		{
			System.out.println("hhiii");
			URL u = new URL("https://github.com/github-developer/using-the-github-api-in-your-app.git");
			HttpURLConnection hr = (HttpURLConnection)u.openConnection();
			if(hr.getResponseCode()==200) {
				InputStream im = hr.getInputStream();
				StringBuffer sb= new StringBuffer();
				BufferedReader br = new BufferedReader(new InputStreamReader(im));
				String line = br.readLine();
				while(line!=null) 
				{
					System.out.println(line);
					line = br.readLine();
					
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
