package com.pd.Array;

import java.util.Arrays;
/*
Author:Pranav Deshmukh
Date:21/11/2022
*/

/*
 Suppose that you are having an array of size N.
  now your task is to sort the half array that is 
from 0 to N/2 in ascending order and N/2+1 to N in descending order. 
 */
public class Question6 {

	
	public static void main(String[] args) {
		int a[]=new int[]{33,45,3,4,1,8,56,36};
		
		int midpt=0;
		int size=a.length;
		
		if(size%2==0){
			midpt=size/2;
		}
		else{
			midpt=(size-1)/2;
		}
		
		System.out.println(midpt);
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
		for(int i=midpt;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));

	}

}
