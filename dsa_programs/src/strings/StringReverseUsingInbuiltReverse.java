package strings;

public class StringReverseUsingInbuiltReverse {

	public static void main(String[] args) {
		
		//don't have reverse in built method in String class so we need to create object for StringBuilder class
		
		String str = "kiran";
		
		StringBuilder newstr = new StringBuilder();
		
		newstr.append(str);
		
		newstr.reverse();
		
		System.out.println(newstr);
		
	

	}

}
