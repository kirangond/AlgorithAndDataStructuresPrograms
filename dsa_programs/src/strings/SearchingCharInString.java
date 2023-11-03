package strings;

public class SearchingCharInString {

	public static void main(String[] args) {
		
		String str = "kiran";
		
		char ch = str.charAt(0);
		
		System.out.println(ch);
		
		char ch1[]=str.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!='k')
			{
				System.out.println("char k not present in string");
			}
			else
			{
				System.out.println("char k present in string at index " + i);
				break;
			}
		}
		

	}

}
