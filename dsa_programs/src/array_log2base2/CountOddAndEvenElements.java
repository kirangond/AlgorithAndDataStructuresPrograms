package array_log2base2;

import java.util.Scanner;

public class CountOddAndEvenElements {
   public static void main(String[] args) {
   int arr[]= {4, 1, 5, 3, 7};
    int odd=0;
    int even=0;
    
    
   
    //Write your code here
    for(int i=0;i<arr.length;i++)
    {
        
        
        if(arr[i]%2==0)
        {
            even=even+1;
            
        }
        else
        {
            odd=odd+1;
        }
        
    }
    System.out.println("Even Number Count = " + even);
    System.out.println("Odd Number Count = " + odd);
    
   }   
    
}




