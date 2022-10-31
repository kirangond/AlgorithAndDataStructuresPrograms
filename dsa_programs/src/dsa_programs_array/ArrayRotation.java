package dsa_programs_array;

public class ArrayRotation {

	public static void main(String[] args) {
   int arr[]= {1, 2, 3, 4, 5, 6, 7,8,9,0};
   int arr1[]=new int[arr.length];
   int d=3;
     
     for(int i=d;i<=arr.length-1;i++)
     {
    	 arr1[i-d]=arr[i];
     }
     
//     for(int i=0;i<arr1.length;i++)
//     {
//     System.out.println(arr1[i]);
//     }
   
     for(int i=0;i<d;i++)
     {
    	  arr1[arr.length-d+i]=arr[i];
     }
     
   for(int i=0;i<arr1.length;i++)
   {
   System.out.println(arr1[i]);
   }
     
	}

}
