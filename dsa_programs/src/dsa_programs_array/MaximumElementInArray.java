package dsa_programs_array;

public class MaximumElementInArray {

	public static void main(String[] args) {
        
		int arr[]= {10,5,7,8,20};
		int max=arr[0];
		
		try {
			for(int i=0;i<arr.length-1;i++)
			{
//				if(arr[i]>arr[i+1])
//				{
//					 max=arr[i];
//				}
				
				 if(arr[i+1]>arr[i])
	        	 {
	        		  max=arr[i+1];
	        	 }
			}
			
		}
		catch (Exception e) {
			System.out.println("arrayIndex");
		}
//		for(int i=0;i<arr.length;i++)
//		{
////			if(arr[i]>arr[i+1])
////			{
////				 max=arr[i];
////			}
//			
//			 if(arr[i+1]>arr[i])
//        	 {
//        		  max=arr[i+1];
//        	 }
//		}
		System.out.println(max);
	}

}
