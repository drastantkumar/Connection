package com.stringprograms;

import java.util.HashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,4,5,3,5,3,1,5,2,5,6,6,6,6,6,6,6,6};
		int n=arr.length;
	//	occuranceOfIntegers(arr,n);
  //occorance(arr,n);
		secondMax(arr,n);
	}

	private static void secondMax(int[] arr, int n) {
		// TODO Auto-generated method stub
		
               
        int lar1=arr[0];   //Initialize the first largest element
        int lar2=arr[1];   //Initialize the second largest element

         //Check by swapping elements
        
               if(lar1<lar2)
                {
                    int temp=lar1;
                    lar1=lar2;
                    lar2=temp;
                }
                
        for(int i=2;i<n;i++)
        {
            if (arr[i] > lar1)
			{
				lar2 = lar1;
				lar1 = arr[i];
			}
			else if (arr[i] > lar2 && arr[i] != lar1)
			{
				lar2 = arr[i];
			}
        }
        System.out.println("First Largest"+lar1);    //Display the first largest
        System.out.println("Second Largest "+lar2);
        System.out.println("Sum  -->"+(lar1+lar2));
        //Display the second largest
        
	}

	private static void occorance(int[] arr, int n) {
		// TODO Auto-generated method stub
		int k=6,count=0;
		for(int i=0;i<n;i++) {
			if(k==arr[i]) {
				count++;
				
			}
		}
		System.out.println(k+"--->"+count);
	}

	private static void occuranceOfIntegers(int[] arr,int n) {
		// TODO Auto-generated method stub
		 Map<Integer, Integer> mp = new HashMap<>();
		 
	        // Traverse through array elements and
	        // count frequencies
	        for (int i = 0; i < n; i++)
	        {
	            if (mp.containsKey(arr[i])) 
	            {
	                mp.put(arr[i], mp.get(arr[i]) + 1);
	            } 
	            else
	            {
	                mp.put(arr[i], 1);
	            }
	        }
	        // Traverse through map and print frequencies
	        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
	        {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	    }
			

		
		
	}


