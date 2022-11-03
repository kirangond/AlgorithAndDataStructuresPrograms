package array_log2base2;

public class SumOf2dArray {

	public static void main(String[] args) {
	 
		int arr[][] = {{1,3},{2,5}};
		int i,j;
		int max_sum=0;
	    for(i = 0; i < arr.length; i++)
	    {
	        for(j = 0; j <  arr.length; j++)
	            {
	                 
	            max_sum =    max_sum+arr[i][j]; 
	                
	            }
	}
	 
	 System.out.println(max_sum);

	}

}
