package com.pd.Array;

/*
Author:Pranav Deshmukh
Date:21/11/2022
*/
/*
 An Array contain the n numbers you have to find out combination which satisfy Pythagoras 
Template
 */
public class Question4 {
	
	public static void main(String args[]){
		int a[]=new int[]{2,7,4,3,12,9,6,5};
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		
		for(int p=0;p<a.length;p++){
			for(int t=p+1;t<a.length;t++){
				for(int v=t+1;v<a.length;v++){
					if(a[p]*a[p]+a[t]*a[t]==a[v]*a[v]){
						System.out.println(" "+a[p]+" "+a[t]+" "+a[v]);
					}
				}
			}
		}
	}

}
