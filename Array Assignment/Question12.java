package com.pd.Array;

import java.util.Arrays;

/*
Author:Pranav Deshmukh
Date:21/11/2022
*/
/*
WAP to sort array on the basis of unit place. 
For example we are having following numbers:-
10,2,3,41,12,13,19,81,9. Output will be 10,41,81,2,12,3,13,19,9
 */
public class Question12 {



	public static void main(String[] args) {
		int a[]=new int[]{10,2,3,41,12,13,19,81,9};
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]%10>a[j]%10){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.println(Arrays.toString(a));
	}

}
