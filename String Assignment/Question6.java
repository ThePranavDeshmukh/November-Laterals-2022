package com.pd.String;

/*
Author:Pranav Deshmukh
Date:21/11/2022
*/

/*
 WAP to demonstrate how memory is allocated to string objects in memory heap and string 
constant pool
 */

public class Question6 {
	
	public static void memoryallocation(){
		
		String s="Pranav";
		String s1="Pranav";
		String s2=new String("Pranav");
		String s3=new String("Pranav");
		
		if(s==s1){
			System.out.println("Hashcode are same as SCP used");
		}
		
		if(s2!=s3){
			System.out.println("HashCode are different as Heap Memory Area used to store String");
		}
		
		if(s!=s3){
			System.out.println("s"+" HashCode are different as SCP area used and for s3 Heap Memory Area used to store String");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question6.memoryallocation();

	}

}
