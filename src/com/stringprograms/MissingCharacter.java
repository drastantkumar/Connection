package com.stringprograms;

import java.util.Set;



public class MissingCharacter {

	public static void main(String[] args) {
		   String str="The quick brown";
		      char s[]=str.toCharArray();
		      int c[]=new int[26];
		      for(int i=0;i<s.length;i++){
		    	  System.out.println("Outsize"+s[i]); 
		          if(s[i]!=' '){
		        	  System.out.println("inside"+s[i]);
		              c[s[i]-'a']++;
		              System.out.println("insideqq"+ c[s[i]-'a']++);
		          }
		      }
		      String s2="";
		      for(int i=0;i<26;i++){
		          if(c[i]==0){
		              s2=s2+(char)(i+'a');
		          }
		      }
		      System.out.println(s2);
		
	}

}
