package algorithm.sorting;

public class HeapSort {

	public static void main(String[] args) {
		int arr[]= {10,20,40,30,80,60,50};
		int size = arr.length-1;
		for( int i=size/2;i>=0;i--)
		{
			Heapify(arr,i,size);
		}
	
	}
//	void BuildHeap( arr[],int size)
//	{
//		int i;
//		for( int i=size/2;i>=0;i--)
//			Heapify(arr,i,size);
//	}
	void Heapify(int arr[], int index, int size)
	{
		int left = 2 * index +1;
		int right = left +1 ;
		
		int max = index;
		
		if(left <=size && arr[left]>arr[max])
			max=left;
		if(right <=size && arr[right]>arr[max])
			max=right;
		
		if(index!=max)
		{
			int temp = arr[max];
			arr[max]=arr[index];
			arr[index]=temp;
		}
		
	}


}
