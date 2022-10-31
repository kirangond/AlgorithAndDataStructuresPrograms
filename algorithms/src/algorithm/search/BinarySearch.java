package algorithm.search;

public class BinarySearch {

	public static void main(String[] args) {

		
		  int arr[]= {10,20,30,40,50};
		  int start=0, end=4, key=5;
		  int mid;
		  while(start<=end)
		  {
			  mid=(start+end)/2;
			  
			  if(arr[mid]==key)
				  System.out.println("key present in array");
			  
			  if(arr[mid]<key)
			  {
				  start = mid + 1;
			  }
			  else
			  {
				  end = mid -1;
			  }
			  
		  }
		  
		  
		
	}

}
