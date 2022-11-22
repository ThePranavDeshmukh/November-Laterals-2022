package com.pd.String;

/*
Author:Pranav Deshmukh
Date:21/11/2022
*/

/*
 WAP to demonstrate which is fast in processing StringBuilder or StringBuffer.
 */
public class Question5 {
	
	public static void main(String args[]){
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		System.out.println(sb);
		long endTime = System.currentTimeMillis();
		long t1 = endTime - startTime;

		

		long startTime2 = System.currentTimeMillis();
		StringBuffer sb2 = new StringBuffer();
		for (int i = 0; i < 100000; i++) {
			sb2.append(i);
		}
		System.out.println(sb2);
		long endTime2 = System.currentTimeMillis();
		long t2 = endTime2 - startTime2;
		System.out.println("Time taken by Stringbuilder: " + t1+"ms");
		System.out.println("Time taken by StringBuffer: " + t2+"ms");
		System.out.println("Extra time taken by StringBuffer is: " + (t2 - t1)+"ms");
	}

}
