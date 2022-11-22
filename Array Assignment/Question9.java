package com.pd.Array;

import java.util.Arrays;

import java.util.Scanner;

/*
Author:Pranav Deshmukh
Date:21/11/2022
*/
/*
 User will enter the element in M*M order matrix that is square matrix now you have to print 
first row, last row, first column, and last column elements. Code should be applicable for matrix 
of any order
 */
public class Question9 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of matrix ");
		int s=sc.nextInt();
		int a[][]=new int[s][s];
		for(int i=0;i<s;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println("Enter the element for "+a[i][j]+" ");
				
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("First row "+Arrays.toString(a[0]));
		
		int f[]=new int[s];
		for(int i=0;i<s;i++){
			f[i]=a[i][0];
		
		
		}
		System.out.println("First column "+Arrays.toString(f));
		System.out.println("Last row "+Arrays.toString(a[s-1]));
		
		int d[]=new int[s];
		for(int i=0;i<s;i++){
			d[i]=a[i][s-1];
		
		
		}
		System.out.println("Last column "+Arrays.toString(d));
		

	}

}
