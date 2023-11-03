package strings;

public class ReverseStringUsingToCharArray {

	public static void main(String[] args) {
		//Convert string into char array.
		
		String s = "kiran";
		
		char ch[]=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
		
//		System.out.println(toString(ch));

	}

}
