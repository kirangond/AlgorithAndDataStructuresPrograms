package array_log2base2;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= { 3, 10, 20, 30};
		 int count=0,key=20;
		    for(int i=0;i<arr.length;i++)
		    {
		        if(arr[i]==key)
		          count++;
		    }
		    
		    if(count==0)
		      System.out.println("Key not found");
		    else
		      System.out.println("Key found");

	}

}
