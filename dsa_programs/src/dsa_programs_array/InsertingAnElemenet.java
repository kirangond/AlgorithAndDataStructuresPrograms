package dsa_programs_array;

public class InsertingAnElemenet {

	public static void main(String[] args) {
          
		int arr[]= {10,20,30,40,50};
		
		//Before inserting new element into an array
		for(int i=0;i<arr.length;i++)
		{
			// System.out.println(arr[i]);
		}
	
		int arr1[] = new int[arr.length+1];

		// Insert element 15 at position 1
		int position = 4;
		int element = 15;
		for(int i=arr.length-1; i>=position;i--)
		{
			 arr1[i+1]=arr[i];
		}
		
		arr1[position] = element;
		
		for(int i=0;i<position;i++)
		{
			arr1[i]=arr[i];
		}
		       
		
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
	}

}
