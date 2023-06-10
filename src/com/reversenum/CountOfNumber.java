package com.reversenum;

public class CountOfNumber {
	public static void main(String args[]) {
		int num=123;
		int count=0;
		System.out.print("Count of the number "+num+" is ");
		while(num>0) {
			num=num/10;
			count=count+1;
		}
		System.out.print(count);
		
	}

}
