package dsa_programs_array;

public class SearchingElemenent {

	public static void main(String[] args) {
        
		int arr[]= {10,20,30,40,50};
		
		int x=10,found=0;
		
		for (int i=0; i<arr.length;i++)
		{
			if(arr[i]==x)
			  found++;
		}
		
		if(found==1)
		{
			System.out.println("x is present");
		}
		else
			System.out.println("x not present");
		
		
	}
	
}
