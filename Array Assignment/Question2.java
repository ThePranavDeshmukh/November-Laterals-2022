package com.pd.Array;
/*
Author:Pranav Deshmukh
Date:21/11/2022
*/
/*
 WAP to find duplicate numbers and there counting from list of numbers.
 */
public class Question2 {

	public static void duplicatenos(){
		int a[]=new int[]{12,23,12,45,90,56,45};
		
		for(int i=0;i<a.length;i++){
			int c=0;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					c++;
				}
			}
			if(c!=0)
				System.out.println(a[i] +" repeats "+c+" times" );
		}
		
	}
	public static void main(String[] args) {
		Question2.duplicatenos();

	}

}
