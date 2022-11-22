package com.pd.String;

/*
Author:Pranav Deshmukh
Date:21/11/2022
*/

/*
 WAP to demonstrate how garbage collector work when any memory is not referenced by string 
object.
 */
public class Question7 {

	int p;
	
	public Question7(int s) {
		super();
		p=s;
	}
	
	protected void finalize(){
		System.out.println("Garbage Collector Executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question7 q=new Question7(98);
		q=null;
		System.gc();

	}

}
