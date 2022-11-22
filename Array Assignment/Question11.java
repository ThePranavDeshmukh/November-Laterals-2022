package com.pd.Array;

import java.util.Arrays;

/*
Author:Pranav Deshmukh
Date:21/11/2022
*/
/*
 WAP to remove the String which is not palindrome string from the array of String.
 */
public class Question11 {

	
	public static void main(String[] args) {
	
		String p="";
		String s[]=new String[]{"sam","sas","tom","Alex","nitin"};
		for(int i=0;i<s.length;i++){
			char c[]=s[i].toCharArray();
			String z="";
			
			for(int j=c.length-1;j>=0;j--){
				z=z+c[j];
			}
			
			if(s[i].equalsIgnoreCase(z)){
				if(p.isEmpty()){
					p=z;
				}
				else{
					p=p+" "+z;
				}
				
				
			}
		}
		
		String x[]=p.split(" ");
		System.out.println(Arrays.toString(x));
		

	}

}
