package strings;

public class ReverseString {
	public static void main(String[] args) {
		
		String s = "kiran";
		
		
//		System.out.println(s.length());
		
		
		
		int i=0;
		int j=s.length();
		
		char ch[]=s.toCharArray();
		 
		while(i<j) {
		char temp=ch[i];
		ch[i]=ch[j-1];
		ch[j-1]=temp;
		i++;
		j--;
		}
		
		for(int k=0;k<ch.length;k++)
		{
			System.out.println(ch[k]);
		}
		
	}

}
