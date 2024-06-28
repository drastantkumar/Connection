package com.practice240524;

import java.util.HashSet;
import java.util.Set;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6,3,4,9,7,8};
	String s1=	removeDuplicateNumber(arr);
String str="aliphaliphiotrecmkdfvd";
String s=removieDuplicatCharacter(str);
	System.out.println(s);
	System.out.println(s1);
	}

	private static String removieDuplicatCharacter(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		Set<Character>set=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			//char[]c1=str.charAt(i);
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

	private static String removeDuplicateNumber(int[] arr) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);
				sb.append(arr[i]);
			}
		}
		return sb.toString();
	}

}
