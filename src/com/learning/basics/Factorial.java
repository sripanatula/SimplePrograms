package com.learning.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =171;
		double factorial=1;
		
		num  = readInt();
		if (num <1 || num >128 ){
			System.out.println("Can not calculate factorial for :"+num);
			return;
		}
		
		for (int i=1;i<= num;i++){
			factorial *=i; 
		}
        System.out.println(" Factorial for the "+num+" is :"+factorial);
	}
	static int readInt(){
		int inputInt=1;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputValue=null;
		try{
			System.out.println("Please enter an integer less than 170 to calculate factorial:");
			inputValue = in.readLine();
		}catch (IOException ioe){
			
		}
		//check if Integer or not
		try{
			inputInt = Integer.parseInt(inputValue);
		}catch(NumberFormatException nfe){
			System.out.println("This is not integer");
		}
		
		return inputInt;
	}

}
