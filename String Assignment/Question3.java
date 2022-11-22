package com.pd.String;

/*
Author:Pranav Deshmukh
Date:21/11/2022
*/

/*
WAP to remove all the vowels from the given string.
*/
public class Question3 {

	public static String removevowel(String s){
		
		char c[]=s.toCharArray();
		char v[]={'A','E','I','O','U','a','e','i','o','u'};
		String p="";
		for(int i=0;i<c.length;i++){
			int f=0;
			for(int j=0;j<v.length;j++){
				if(c[i]==v[j]){
				f++;
				}
				
			}
			if(f==0){
				p=p+String.valueOf(c[i]);
			}
		}
		
		return p;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String D=Question3.removevowel("Pranav");
		System.out.println(D);

	}

}
