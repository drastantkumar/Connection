package com.stringprograms;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,3,4,5,3,4,5};
Map<Integer,Integer> map=new HashMap<Integer, Integer>();
for(int i=0;i<a.length;i++) {
	if(map.containsKey(a[i])) { 
		map.put(a[i], map.get(a[i]+1));
		
	}else {
		map.put(a[i], 1);
		
	}
}
for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
	if(entry.getValue()>1) {
		System.out.println(entry.getValue()+"  "+entry.getKey());
	}
}
	}

}
