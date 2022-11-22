package com.pd.String;

import java.util.Scanner;

/*
 Author:Pranav Deshmukh
 Date:21/11/2022
 */

/*Question=Create a program in which two string is input by the user 
and after that user will enter index in 
first string where we want to insert the second string 
and insert the second string at that index 
and create a new string*/

public class Question1 {
	public String ModifyString(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter First String ");
		
		StringBuilder s1=new StringBuilder(sc.next());
		System.out.println("Please Enter Second String ");
		StringBuilder s2=new StringBuilder(sc.next());
		System.out.println("Please Enter the index where you want to insert Second String ");
		int i=sc.nextInt();
		
		
		String s=s1.substring(0,i)+s2+s1.substring(i);
		
		return s.toString();
		
	}
	
	public static void main(String args[]){
		Question1 q1=new Question1();
		String d=q1.ModifyString();
		System.out.println(d);
		
	}

}
