package com.pd.Array;


/*
Author:Pranav Deshmukh
Date:21/11/2022
*/

/*
 An Array Contain different numbers you have to find 
 how many are even, odd, perfect and prime 
 */
public class Question5 {

	public static void main(String[] args) {
		int e=0;
		int o=0;
		int p=0;
		int pr=0;
		
		int a[]=new int[]{3,7,9,2,4,5,11,16,6};
		
		for(int i=0;i<a.length;i++){
			int temp=0;
			int count=0;
			int sum=0;
			
			if(a[i]%2==0){
				e++;
			}
			else{
				o++;
			}
			
			for(int j=1;j<=a[i];j++){
				if(a[i]%j==0){
					count++;
					if(j!=a[i]){
					sum=sum+j;
					}
					
				}
				
			}
			if(count==2){
				pr++;
			}
			if(sum==a[i]){
				p++;
			}
			
			
		}

		System.out.println("Even numbers are "+e);
		System.out.println("Odd numbers are "+o);
		System.out.println("Perfect numbers are "+p);
		System.out.println("Prime numbers are "+pr);
		
	}

}
