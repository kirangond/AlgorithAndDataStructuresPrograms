package algorithm.search;

public class KadensAlgoMaximumSumArray {

	public static void main(String[] args) {
//		int arr[]= {5,-4,-2,6,-1};
//		int arr[]= {1,5,3,2,1};
		int arr[]= {-5,4,6,-3,4,-1};
		int max_sum=Integer.MIN_VALUE,current_sum=0;
		//for negative values replace max_sum=0 with max_sum=Integer.MIN_VALUE;
		
		
		//run the loop from first element from array to nth element in array
		
		for(int i=0;i<arr.length;i++)
		{
			current_sum=current_sum+arr[i];
			
			if(current_sum>max_sum)
			{
				max_sum=current_sum;
			}
			
			if(current_sum<0)
			{
				current_sum=0;
			}
		}
		
		System.out.println(max_sum);

	}

}
