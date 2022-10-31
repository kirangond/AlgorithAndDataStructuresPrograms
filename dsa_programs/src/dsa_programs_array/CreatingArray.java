package dsa_programs_array;

public class CreatingArray {

	public static void main(String[] args) {
          int arr[]; // declaring array of integer type
          arr=new int[5]; //allocation memory to array of size 5
          System.out.println(arr[0]); // by default zero in all position
          System.out.println(arr[1]);
          arr[0]=10;
          arr[1]=20;
          arr[2]=30;
          arr[3]=40;
          arr[4]=50;
          
       /*   System.out.println(arr[0]); //10
          System.out.println(arr[1]); //20
          System.out.println(arr[2]); //30
          System.out.println(arr[3]); //40
          System.out.println(arr[4]); //50
        */
          System.out.println(arr.length); // To print length of array
          
          // Printing array of elements through for loop
          for(int i=0;i<arr.length;i++)
          {
        	  System.out.println(arr[i]);
          }
          
          
	}

}
