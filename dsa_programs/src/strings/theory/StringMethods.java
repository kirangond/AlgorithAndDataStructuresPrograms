package strings.theory;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "kiran";
		
		System.out.println(str.length()); // Will print the length of the string
		
		System.out.println(str.toLowerCase()); //Will return new string into lower case
		
		System.out.println(str.toUpperCase());  //Will return new  string into upper case
		
		System.out.println(str.trim()); // It will remove unwanted space
		
		System.out.println(str.substring(0)); //It will print from the starting of index number what we pass in parameter
		
		System.out.println(str.substring(2)); //ran //It will return new sub string
		
		System.out.println(str.substring(0,4)); //Including starting index and exclude end index and return the new string with sub string
		
		System.out.println(str.replace('a', 'e')); //replace a with e and replace all occurrence
		
		System.out.println(str.replace("ir", "en")); //replace ir with en
		
		System.out.println(str.replace("i", "pavan")); //replace i with pavan at all occurrence of i
		
		System.out.println(str.startsWith("k")); //will return the true because string starts with k
		System.out.println(str.startsWith("ir")); //will return the false because string do no start with ir
		
		System.out.println(str.endsWith("ran"));//true 
		
		System.out.println(str.charAt(1)); //will return the char at index
		
		System.out.println(str.indexOf('r')); // It will return the index of r character at first occurence only and if not found -1 will return
		
		System.out.println(str.indexOf('a',0)); // will return the index of char a and will search from the index given
		
		String str1="kirangond"; 
		System.out.println(str.lastIndexOf('n')); // It will return last occurence of the char
		
		System.out.println(str.lastIndexOf('n',5));
		
		System.out.println(str.equals("kiran")); // will return true if matches
		
		System.out.println(str.equals("kiran")); // will return true if matches
		
		System.out.println(str.equals("Kiran"));  //will return false because of case sensitive
		
		System.out.println(str.equalsIgnoreCase("KiRan")); //will return true because it will ignore the case
					}  

}
