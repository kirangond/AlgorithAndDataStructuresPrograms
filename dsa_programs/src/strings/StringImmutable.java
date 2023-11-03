package strings;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "kiran";
		s.concat("gond");
		
		System.out.println(s);
		
		s=s.concat("gond");
		System.out.println(s);
	}

}
