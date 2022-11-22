package com.pd.Array;

/*
Author:Pranav Deshmukh
Date:21/11/2022
*/
/*
 WAP to create a dynamic array. Dynamic Array means when user want to input the number 
more than size of array it will increase the size of array without throwing exception.
 */
import java.util.Scanner;

public class Question3 {

	int a[]=new int[4];
	
	public void increasesize(int l){
		int t[]=new int[l+1];
		for(int p=0;p<a.length;p++){
			t[p]=a[p];
			
		}
		a=new int[t.length];
		
		for(int k=0;k<a.length;k++){
			a[k]=t[k];
			
		}
		
		
	}	

	public void dynamicarray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element you want to put in array ");
		int c=sc.nextInt();
		for(int i=0;i<c;i++){
			System.out.println("Enter the number ");
				int f=sc.nextInt();
				
				if(a.length<c){
					increasesize(a.length);
				}
				a[i]=f;
		}
		
		for(int y:a)
		System.out.println(y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question3 q=new Question3();
		q.dynamicarray();
	
	}

}
