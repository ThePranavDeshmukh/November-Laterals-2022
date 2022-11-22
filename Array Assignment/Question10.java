package com.pd.Array;

import java.util.Arrays;
/*
Author:Pranav Deshmukh
Date:21/11/2022
*/
/*
 You are having array of strings. Now you have to arrange strings 
 in array on the basis of the 
length of each string. Smallest string will be first and so on. 
 */
public class Question10 {

	public static void main(String[] args) {
		String s[]=new String[]{"Sam","Shubham","Lavish","Pranav","Pune"};
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++){
					if(s[i].length()>s[j].length()){
						String temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
				
			}
			
		}

		System.out.println(Arrays.toString(s));
	}

}
