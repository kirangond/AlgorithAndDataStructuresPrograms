package com.kadens;

public class MaximumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {-5,4,6,-3,4,-1};
		int arr[] = {5,4,6,3,4,1};
		int size = 6;
		
		int max = 0;
		
		for (int i = 0;i<size;i++)
		{
			int sum = 0;
			for(int j = i; j<size;j++)
			{
				sum = sum + arr[j];
			}
			
			if (sum>max)
			{
				max = sum;
			}
		}
		
		System.out.println("max: "+ max);

	}

}
