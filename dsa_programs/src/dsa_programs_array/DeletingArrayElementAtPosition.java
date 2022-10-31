package dsa_programs_array;

public class DeletingArrayElementAtPosition {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int x=40;
		
		int newArray[]= new int[arr.length-1];
				
        for(int i=0;i<arr.length-1;i++)
        {
        	if(arr[i]==x)
        	{
        		for(int j=arr.length-1;j>i;j--)
        		{ 
        			newArray[j-1]=arr[j];
        	    }
        	}
        }
        
        for(int i=0;i<3;i++)
        {
        	newArray[i]=arr[i];
        }
        
        for(int i=0;i<newArray.length;i++) {
        System.out.println(newArray[i]);}
	}

}
