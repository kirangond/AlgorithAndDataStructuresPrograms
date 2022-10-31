package algorithm.search;

public class LinearSearchFunction {

	public static void main(String[] args) {

		 int arr[]= {2,4,5,3,1};
		 int key=0;
		 
		int result =linearSearch(arr,key);
		
		if(result==1)
		{
			System.out.println("present in array");
			
		}
		else
		{
			System.out.println("not present in array");
		}
		
	}

	private static int linearSearch(int[] arr, int key) {
		    for(int i=0;i<arr.length-1;i++)
		    {
		    	if(arr[i]==key)
		    	{
		    		return 1;
		    	}
		    }
		    return -1;
	}

}
