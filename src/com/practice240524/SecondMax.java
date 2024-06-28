package com.practice240524;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,6,8,4,2,5,2,4,7,8,9,2,55,99,44,88,22};
int one=arr[0];
int two=arr[1];
if(one<two) {
	int temp=one;
	one=two;
	two=temp;
}
for(int i=2;i<arr.length;i++) {
	if(arr[i]>one) {
		two=one;
		one=arr[i];
		
	}
	if(arr[i]>two && arr[i]!=one) {
		two=arr[i];
	}
}
System.out.println(one+"-------------"+two);
System.out.println("Sum--->"+(one+two));
	}

}
