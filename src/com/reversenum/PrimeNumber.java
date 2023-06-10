package com.reversenum;


public class PrimeNumber {
	public static void main(String args[]) {
		int num=7;
		boolean flag=false;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println(num +" is not a prime number");
		}
		else {
			System.out.println(num+" is a prime number");
		}
	}

}
