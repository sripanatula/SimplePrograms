package com.learning.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =readInt();
		if (num < 1 || num > 128 ){
			System.out.println("Can not generate fibonacci series for :"+num);
			return;
		}
		System.out.print("Fibonacci series :");
		if (num == 1){
			System.out.println(num);
			return;
		}
		int curr = 1;
		System.out.print(curr+" ");
		int prev = curr;	
		for (int i=1; i<=num;i++){
			System.out.print(curr+" ");
			int temp = curr;
			curr += prev;
			prev = temp;
		}
	}
	static int readInt(){
		int inputInt=1;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputValue=null;
		try{
			System.out.println("Please enter an integer less than 170 to generate Fibonacci series:");
			inputValue = in.readLine();
		}catch (IOException ioe){
			
		}
		//check if Integer or not
		try{
			inputInt = Integer.parseInt(inputValue);
		}catch(NumberFormatException nfe){
			System.out.println("Input entered is not integer");
		}
		return inputInt;
	}
}
