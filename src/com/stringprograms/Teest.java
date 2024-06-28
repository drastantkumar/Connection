package com.stringprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Teest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,5,1,1,9,9,9};
		int a2[]= {2,1,11,7,6,5,6,1};
		String s=Arrays.toString(a);
		StringBuffer sb=new StringBuffer(s);
	//	System.out.println(sb.reverse());
		char k[]=s.toCharArray();
		
		//replacedNumber(a2);
		//find max no. in array
		
		//System.out.print(MaxNo(a));
		SumOfTwoLargest(a);
	//	int a1= SumOfTwoLargest(a);
		

	}

	private static void replacedNumber(int[] a2) {
		// TODO Auto-generated method stub
		
		
		
		for(int i=1;i<a2.length;i++) {
			if(i==a2.length-1) {
				a2[i]=-1;
			}else {
			for(int j=i+1;j<a2.length;j++) {
				
					if(a2[i]>=a2[j])
					{
						a2[i]=a2[j];
						break;
				}
				}
				//System.out.println(a2[i]+"  "+a2[j]);
				
			}
			
		}
		
		
		for(int i=0;i<a2.length;i++)
		System.out.print(a2[i]);
	}

	private static void SumOfTwoLargest(int[] a) {
		// TODO Auto-generated method stub
		int sum=0,temp=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
				
					Map<Integer,Integer> map =new HashMap<>();
					for(int i1=0;i1<a.length;i1++) {
						if(map.containsKey(a[i])) {
							map.put(a[i1],map.get(a[i1])+1);
						}else {
							map.put(a[i], 1);
						}
					}
					for(Map.Entry<Integer,Integer> p: map.entrySet()) {
						if(p.getValue()>1)
							System.out.println(p.getValue()+" "+p.getKey() );
					}
				}
			}
		}
		for(int e:a) {
			System.out.println(a[e]);
		}
			//System.out.println(a.length+" 55555"+a[1]+" "+a[0]+"");
		//sum=(a[a.length-1]+a[a.length-2]);
	
	}

	public static int MaxNo(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
			return max;
	}
}
