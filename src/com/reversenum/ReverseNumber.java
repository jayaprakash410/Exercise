package com.reversenum;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=123;
		int sum=0;
		System.out.println("Original number: "+num);
		System.out.print("Reversed number: ");
		while(num>0) {
			int rem=num%10;
			sum=rem;
			num=num/10;
			System.out.print(sum);
		}

	}

}
