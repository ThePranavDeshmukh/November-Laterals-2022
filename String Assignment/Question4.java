package com.pd.String;

/*
Author:Pranav Deshmukh
Date:21/11/2022
*/

/*
 WAP to print the number of alphabets repeated in the given string.
 */
public class Question4 {
	
	public static int RepeatedString(String s){
		char c[]=s.toCharArray();
		int f=0;
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					f++;
				}
			}
		}
		return f;
		
	}
	
	public static void main(String args[]){
		int count=Question4.RepeatedString("Pranav");
		System.out.println("Repeated char Count is "+count);
	}

}
