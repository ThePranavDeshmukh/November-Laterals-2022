package com.pd.String;

import java.util.Arrays;

/*
Author:Pranav Deshmukh
Date:21/11/2022
*/
/*
 WAP to print the all alphabets of string in ascending and descending order.
 */
public class Question2 {

	public static void main(String[] args) {
		String S="pranav";
		
		char c[]=S.toCharArray();
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				
				if(c[i]>c[j]){
					char t=c[i];
					c[i]=c[j];
					c[j]=t;
					
				}
			}
		}
		
		System.out.println("Ascending Order "+Arrays.toString(c));
		
		char []p=S.toCharArray();
		for(int i=0;i<p.length;i++){
			for(int j=i+1;j<p.length;j++){
				
				if(p[i]<p[j]){
					char t=p[i];
					p[i]=p[j];
					p[j]=t;
					
				}
			}
		}
		
		System.out.println("Descending Order "+Arrays.toString(p));

	}

}
