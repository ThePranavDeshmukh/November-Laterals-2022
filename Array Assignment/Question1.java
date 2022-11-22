package com.pd.Array;
/*
Author:Pranav Deshmukh
Date:21/11/2022
*/

/*
 WAP to find third maximum number from list of numbers
 */
public class Question1 {

	public static int thirdmax(){
		int h=0;
		int a[]=new int[]{12,6,8,34,45,68,98};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		h=a[2];
		return h;
	}
	public static void main(String[] args) {
		System.out.println("Third Highest number is "+Question1.thirdmax());

	}

}
