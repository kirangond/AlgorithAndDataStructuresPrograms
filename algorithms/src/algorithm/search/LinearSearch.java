package algorithm.search;

public class LinearSearch {

	public static void main(String[] args) {
         
		int arr[]= {2,4,5,3,1};
		int key=5,count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				count++;
			}
		}
		
		if(count==1)
		{
			System.out.println("key is present in array");
		}
		else
		{
			System.out.println("key is not present in array");
		}
		
		
	}

}
