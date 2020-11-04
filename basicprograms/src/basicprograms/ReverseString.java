package basicprograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String st="i am chidanand";
		char ch[] = st.toCharArray();
		int j=ch.length-1;
		int i=0;
		while(j>=i) {
			char t=ch[j];
			ch[j]=ch[i];
			ch[i]=t;
			j--;
			i++;	
		}
		String s = new String(ch);
		System.out.println(s);

	}

}
