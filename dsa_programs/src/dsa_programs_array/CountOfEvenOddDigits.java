package dsa_programs_array;

public class CountOfEvenOddDigits {

	public static void main(String[] args) {
		
		 // int[] arr = {3, 1, 2, 3};
		int[] arr = {4, 1, 5, 3, 7};
		
		    int odd=0;
		    int even=0;
		    
		   for(int i=0;i<arr.length-1;i++)
		   {
			   int sum=0;
			   
			   sum=arr[i]+arr[i+1];
			   if(sum%2!=0)
			   {
				  odd=odd+1;
			   }
			   else
			   {
				   even=even+1;
			   }
		   }
		   System.out.println(odd);
		   System.out.println(even);

	}

}
