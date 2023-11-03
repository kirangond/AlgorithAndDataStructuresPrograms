package strings;

public class StringReverseUsingExtractingAndInserting {

	public static void main(String[] args) {
		
		String str = "kiran", newStr="";
		
		//String object is immutable and it does not have reverse inbuilt method
		
		char ch;
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			newStr=ch+newStr; //every time it will append new character in front of it so it will become revers
		}
		
		System.out.println(newStr);
	}

}
