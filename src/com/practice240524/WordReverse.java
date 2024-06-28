package com.practice240524;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java is a tipical language";
		wordReverseString(str);
		camelCasing(str);

	}

	private static void camelCasing(String str) {
		// TODO Auto-generated method stub
		String a[]=str.split("");
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<a.length;i++) {
			
			
		}
	}

	

	private static void wordReverseString(String str) {
		// TODO Auto-generated method stub
		//char c;
		String s[]=str.split("");
		for(int i=s.length-1;i>=0;i--) {
			
			System.out.print(s[i]);
		}
	}
	
	

}
