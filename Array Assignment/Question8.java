package com.pd.Array;

/*
Author:Pranav Deshmukh
Date:21/11/2022
*/

/*
 You are given a sequence of Character in the form of Array. Now you have to put all vowels and 
consonants together in the array.

 */
public class Question8 {

	public static void main(String[] args) {
		
		String str = "zjfhcnvtovdkerolasnto";

		char[] a1 = str.toCharArray();

		System.out.println("The consonents  are:");
		System.out.print("{");

		for (int i = 0; i < a1.length; i++) {
			if (a1[i] == 'a' || a1[i] == 'e' || a1[i] == 'i' || a1[i] == 'o' || a1[i] == 'u') {
				continue;
			}
			System.out.print(a1[i] + ",");

		}
		System.out.println("}");
		System.out.println("The vowels are:");
		System.out.print("{");
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] == 'a' || a1[i] == 'e' || a1[i] == 'i' || a1[i] == 'o' || a1[i] == 'u') {
				System.out.print(a1[i] + ",");
			}
		}
		System.out.println("}");

	}

}
