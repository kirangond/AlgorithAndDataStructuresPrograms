package algorithm.sorting;

public class SelectionSort {

	
	public static void main(String[] args) {

		int arr[]= {180,165,150,170,145};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					//swap(&arr[i],&arr[j]);
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.println(arr[i]);
		}

	}

}
